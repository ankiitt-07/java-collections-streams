package com.annotation.custom_annotations.custom_caching;

import java.lang.reflect.Method;
import java.util.*;

public class MethodRegistry {
    // Stores method calls and their results: { Method -> [ (Input, Output), (Input, Output) ] }
    private static final Map<Method, List<Map.Entry<List<Object>, Object>>> cache = new HashMap<>();

    // Register all methods of a class
    public static void registerMethods(Class<?> clazz) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(CacheResult.class)) {
                cache.put(method, new ArrayList<>());
                System.out.println("Registered: " + method.getName() + " from " + clazz.getSimpleName());
            }
        }
    }

    // Invoke a method with caching
    public static Object invokeMethod(Object instance, String methodName, Object... args) {
        Class<?> clazz = instance.getClass();

        // Find the method
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.getName().equals(methodName) && method.isAnnotationPresent(CacheResult.class)) {
                List<Object> argList = Arrays.asList(args);
                List<Map.Entry<List<Object>, Object>> history = cache.get(method);

                // Check if the same input has been used before
                for (Map.Entry<List<Object>, Object> entry : history) {
                    if (entry.getKey().equals(argList)) {
                        System.out.println("Cache hit: Returning cached result for " + methodName);
                        return entry.getValue();
                    }
                }

                // Compute result and store it
                try {
                    Object result = method.invoke(instance, args);
                    history.add(new AbstractMap.SimpleEntry<>(argList, result));
                    System.out.println("Computed and Cached: " + methodName + " -> " + result);
                    return result;
                } catch (Exception e) {
                    System.out.println("Error invoking method: " + methodName);
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Method not found: " + methodName);
        return null;
    }
}

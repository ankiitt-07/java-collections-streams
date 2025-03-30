package com.annotation.custom_annotations.importantmethod;

import java.lang.reflect.Method;

import java.lang.reflect.Method;

public class Methods {
    @ImportantMethod
    public static void method1() {
        System.out.println("method1 called");
    }

    @ImportantMethod(priority = Priority.LOW)
    public static void method2() {
        System.out.println("method2 called");
    }

    public static void checkMethod() {
        Class<?> clazz = Methods.class;

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod m=method.getAnnotation(ImportantMethod.class);
                System.out.println("Method name : " + m + " Priority : " + m.priority());
            }
        }
    }

    public static void main(String[] args) {
        Methods method=new Methods();
        method.checkMethod();
    }
}

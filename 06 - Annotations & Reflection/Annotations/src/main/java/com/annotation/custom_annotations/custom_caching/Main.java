package com.annotation.custom_annotations.custom_caching;

public class Main {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        // Register methods
        MethodRegistry.registerMethods(MathOperations.class);

        // Invoke methods and demonstrate caching
        System.out.println("\n🔹 First Computation:");
        System.out.println("Result: " + MethodRegistry.invokeMethod(mathOps, "add", 3, 5));
        System.out.println("Result: " + MethodRegistry.invokeMethod(mathOps, "multiply", 4, 2));

        System.out.println("\n🔹 Second Computation (Same Inputs - Should Use Cache):");
        System.out.println("Result: " + MethodRegistry.invokeMethod(mathOps, "add", 3, 5));  // Cached
        System.out.println("Result: " + MethodRegistry.invokeMethod(mathOps, "multiply", 4, 2));  // Cached

        System.out.println("\n🔹 New Computation (Different Inputs - Should Recompute):");
        System.out.println("Result: " + MethodRegistry.invokeMethod(mathOps, "add", 7, 2));
        System.out.println("Result: " + MethodRegistry.invokeMethod(mathOps, "multiply", 3, 3));
    }
}


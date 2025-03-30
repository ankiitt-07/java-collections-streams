package com.annotation.custom_annotations.custom_caching;

public class MathOperations {
    @CacheResult
    public int add(int a, int b) {
        System.out.println("⚙️ Computing add(" + a + ", " + b + ")");
        return a + b;
    }

    @CacheResult
    public int multiply(int a, int b) {
        System.out.println("⚙️ Computing multiply(" + a + ", " + b + ")");
        return a * b;
    }
}

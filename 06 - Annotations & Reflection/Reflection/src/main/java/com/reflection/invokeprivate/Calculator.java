package com.reflection.invokeprivate;

public class Calculator {
    private static int multiply(int a,int b){
        return a*b;
    }

    private static int addition(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        InvokeMethod.invokeMethod(Calculator.class, 5, 6);
    }
}

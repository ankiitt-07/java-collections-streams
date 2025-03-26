package com.methods;

public class Method {
    public static void method1(int x, int y){
        if(y == 0){
            throw new ArithmeticException("Division by zero");
        }
    }
    public static void method2(int x, int y){
        method1(x, y);
    }
}

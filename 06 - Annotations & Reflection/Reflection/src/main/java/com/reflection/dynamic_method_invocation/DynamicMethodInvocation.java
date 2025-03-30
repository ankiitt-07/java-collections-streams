package com.reflection.dynamic_method_invocation;

import java.util.Scanner;

public class DynamicMethodInvocation {

    public static void main(String[] args) {
       try {
           Scanner sc = new Scanner(System.in);
           String s = sc.nextLine();
           int a = sc.nextInt();
           int b = sc.nextInt();
           Class<?> clazz = MathOperations.class;
           switch (s) {
               case "addition":
                   System.out.println(clazz.getDeclaredMethod("addition", int.class, int.class).invoke(clazz, a, b));
               case "subtraction":
                   System.out.println(clazz.getDeclaredMethod("subtraction", int.class, int.class).invoke(clazz,a,b));
               case "multiplication":
                   System.out.println(clazz.getDeclaredMethod("multiplication", int.class, int.class).invoke(clazz,a,b));
           }
       }
       catch (Exception e){
           throw new RuntimeException();
       }
    }

}

package com.reflection.invokeprivate;

import java.lang.reflect.Method;

public class InvokeMethod {
    public static void invokeMethod(Class<?> calc ,int a,int b){
      try {
          Method method = calc.getDeclaredMethod("multiply", int.class, int.class);
          method.setAccessible(true);
          int multi= (int) method.invoke(calc,a,b);
          System.out.println(multi);
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
    }
}
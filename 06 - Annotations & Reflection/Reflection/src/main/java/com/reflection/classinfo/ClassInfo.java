package com.reflection.classinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInfo {

    public static void getInfo(Object obj){
        Class<?>clazz = obj.getClass();

        Method[] methods=clazz.getDeclaredMethods();
        Field[] fields=clazz.getDeclaredFields();
        Constructor<?>[] constructors= clazz.getDeclaredConstructors();

        for(Field field :fields){
            System.out.println("Field : "+ field.getName());
        }

        for(Method method:methods){
            System.out.println("Method : "+ method.getName());
        }

        for(Constructor<?> constructor :constructors){
            System.out.println("Constructor : "+ constructor.getName());
        }
    }
}

package com.reflection.accessprivate;

import java.lang.reflect.Field;

public class AccessPrivateField {
    public static void modifyPrivate(Person person , int age){
        try{
            Field field=person.getClass().getDeclaredField("age");
            field.setAccessible(true);
            field.set(person,age);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

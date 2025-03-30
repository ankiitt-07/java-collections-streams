package com.reflection.dynamicallycreateobjects;

public class CreateObject {

    public static Object createObj(Class<?> clazz , String name , String course , int year){
        try{
            Object object = clazz.getDeclaredConstructor(String.class,String.class,int.class).newInstance(name,course,year);
            return object;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }return null;
    }
}

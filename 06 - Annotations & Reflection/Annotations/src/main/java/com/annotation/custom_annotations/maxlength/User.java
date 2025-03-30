package com.annotation.custom_annotations.maxlength;

import java.lang.reflect.Field;

public class User {
    @MaxLength(5)
    String username;
    public User(String username) throws InterruptedException{
        try{
            Class<?>clazz=this.getClass();
            Field usernameField= clazz.getDeclaredField("username");
            MaxLength maxLength=usernameField.getAnnotation(MaxLength.class);

            if (maxLength != null && username.length() > maxLength.value()) {
                throw new IllegalArgumentException("Username length exceeds maximum allowed (" + maxLength.value() + ")");
            }
            this.username = username;
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        User user=new User("Rishav");
    }
}

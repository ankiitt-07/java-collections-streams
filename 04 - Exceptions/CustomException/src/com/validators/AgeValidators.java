package com.validators;

import com.custom_exceptions.InvalidAgeException;

public class AgeValidators {
    public static void validateAge(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException();
        }
        System.out.println("Age is " + age + " Access Granted!");
    }
}

package com.custom_exceptions;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(){
        super("Invalid Age : Age must be 18 or above");
    }
}

package com.advanced.password_validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static boolean validate (String password) {
        String regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
}

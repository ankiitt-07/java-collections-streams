package com.advanced.user_registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean registerUser (String username, String email, String password) {
        String usernameRegex = "[A-Za-z0-9]+";
        String emailRegex = "^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z0-9]{2,}$";
        String passwordRegex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";

        Pattern usernamePattern = Pattern.compile(usernameRegex);
        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern passwordPattern = Pattern.compile(passwordRegex);

        Matcher usernameMatcher = usernamePattern.matcher(username);
        Matcher emailMatcher = emailPattern.matcher(email);
        Matcher passwordMatcher = passwordPattern.matcher(password);

        if (usernameMatcher.matches() && emailMatcher.matches() && passwordMatcher.matches()) {
            return true;
        }
        throw new IllegalArgumentException();
    }
}

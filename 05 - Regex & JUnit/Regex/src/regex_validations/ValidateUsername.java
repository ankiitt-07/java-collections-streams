package regex_validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static void validate(String username) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{5,15}$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(username);

        System.out.println("valid username: " + matcher.matches());
    }
}

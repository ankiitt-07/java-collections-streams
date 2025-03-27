package regex_validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSocialSecurity {
    public static void validate(String str) {
        String regex = "[\\w\\s]+\\b[0-9]{3}-[0-9]{2}-[0-9]{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        System.out.println("valid SSN: " + matcher.matches());
    }
}

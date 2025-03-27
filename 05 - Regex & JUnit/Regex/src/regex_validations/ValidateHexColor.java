package regex_validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexColor {
    public static void validate(String hexCode) {
        String regex = "^#[0-9a-fA-F]{6}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(hexCode);

        System.out.println("valid hex code: " + matcher.matches());
    }
}

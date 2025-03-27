package regex_validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlate {
    public static void validate(String licensePlate) {
        String regex = "^[A-Z]{2,}\\d{4}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(licensePlate);

        System.out.println("valid license plate: " + matcher.matches());
    }
}

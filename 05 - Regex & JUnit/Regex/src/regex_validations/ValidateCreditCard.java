package regex_validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCard {
    public static void validate(String str) {
        String visaRegex = "^4\\d{16}";
        String masterRegex = "^5\\d{16}";

        Pattern visaPattern = Pattern.compile(visaRegex);
        Pattern masterPattern = Pattern.compile(masterRegex);

        Matcher visaMatcher = visaPattern.matcher(str);
        Matcher masterMatcher = masterPattern.matcher(str);

        if (visaMatcher.matches()) {
            System.out.println("Credit Card is VISA");
        }
        else if (masterMatcher.matches()) {
            System.out.println("Credit Card is MASTER");
        }
        else{
            System.out.println("Credit Card is not valid");
        }
    }
}

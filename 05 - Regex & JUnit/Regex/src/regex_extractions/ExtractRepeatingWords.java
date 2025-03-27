package regex_extractions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractRepeatingWords {
    public static void extract(String str) {
        String regex = "(?i)\\b(\\w+)\\b\\s+\\b\\1\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        System.out.print("Extracted Repeated Words: [");
        while(matcher.find()){
            System.out.print(matcher.group() + ", ");
        }
        System.out.println("]");
    }
}

package regex_extractions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    public static void extract(String str) {
        String regex = "[0-9]{2}/[0-9]{2}/[0-9]{4}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        System.out.print("Extracted Dates: : [");
        while(matcher.find()){
            System.out.print(matcher.group() + ", ");
        }
        System.out.println("]");
    }
}

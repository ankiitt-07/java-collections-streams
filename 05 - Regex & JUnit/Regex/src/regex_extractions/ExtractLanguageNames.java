package regex_extractions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLanguageNames {
    public static void extract(String str){
        String regex = "(?i)\\b(java|python|javascript)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        System.out.print("Extracted Names : [");
        while(matcher.find()){
            System.out.print(matcher.group() + ", ");
        }
        System.out.println("]");
    }
}

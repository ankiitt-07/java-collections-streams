package regex_extractions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void extract(String str){
        String regex = "[A-Za-z0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        System.out.print("Extracted Emails : [");
        while(matcher.find()){
            System.out.print(matcher.group() + ", ");
        }
        System.out.println("]");
    }
}

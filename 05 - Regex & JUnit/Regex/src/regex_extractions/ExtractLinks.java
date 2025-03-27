package regex_extractions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
    public static void extract(String str){
        String regex = "(https?://[\\w.-]+(?:\\.[A-Za-z]{2,})+(?:/\\S*)?)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        System.out.print("Extracted Links : [");
        while(matcher.find()){
            System.out.print(matcher.group() + ", ");
        }
        System.out.println("]");
    }
}

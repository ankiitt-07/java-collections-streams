package regex_replace_modify;

public class CensorBadWords {
    public static void replace(String str){
        String regex = "(?i)\\b(damn | stupid)\\b";

        str = str.replaceAll(regex, " **** ");

        System.out.println("Censored Sentence: " + str);
    }
}

package regex_replace_modify;

public class SpacesToSingleSpace {
    public static void replace (String str){
        String regex = "\\s+";

        str = str.replaceAll(regex, " ");

        System.out.println("Multiple spaces replaced with single space: " + str);
    }
}

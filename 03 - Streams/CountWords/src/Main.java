import file_handler.CountWords;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map <String, Integer> map = CountWords.count("src/content/text.txt");
        System.out.println(map);
    }
}
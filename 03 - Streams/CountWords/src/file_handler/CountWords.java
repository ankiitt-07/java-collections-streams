package file_handler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static Map<String, Integer> count(String filename) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String word : line.split(" ")) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return map;
    }
}

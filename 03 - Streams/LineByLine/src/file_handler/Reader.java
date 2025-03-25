package file_handler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public static List<String> findLine (String fileName, String word) {
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(word)) {
                    list.add(line);
                }
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }
}

package filter_streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FilterStream {
    public static void convertCopyToLower(String src, String dest) {
        try (
            BufferedReader br = new BufferedReader(new FileReader(src));
            BufferedWriter bw = new BufferedWriter(new FileWriter(dest))
        ) {
            String line;
            while ((line = br.readLine()) != null){
                line = line.toLowerCase();
                bw.write(line);
                bw.newLine();
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

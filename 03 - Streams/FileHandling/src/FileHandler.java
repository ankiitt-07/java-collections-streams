import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileHandler {
    public static List<Integer> readFile(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            List<Integer> lines = new LinkedList<>();
            int line;
            while ((line = fis.read()) != -1){
                lines.add(line);
            }
            return lines;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void writeFile(String filePath, List<Integer> lines) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (int line : lines) {
                bw.write(line);
            }
            System.out.println("File written successfully");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

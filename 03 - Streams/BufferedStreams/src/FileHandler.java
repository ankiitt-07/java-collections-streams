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
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            for (int line : lines) {
                fos.write(line);
            }
            System.out.println("File written successfully");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void copyFileBuffered(String inputFilePath, String outputFilePath) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFilePath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFilePath))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully with buffering.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

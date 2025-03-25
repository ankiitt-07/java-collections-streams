import java.io.*;

public class FileHandler {
    public static String readConsole(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            return br.readLine();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void writeFile(String fileName, String content){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
            bw.write(content);
            bw.newLine();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

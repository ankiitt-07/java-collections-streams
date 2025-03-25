import file_handler.Reader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lines = Reader.findLine("src/content/text.txt", "error");

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        FileHandler.writeFile("src/content/output.txt", FileHandler.readFile("src/content/input.txt"));
    }
}
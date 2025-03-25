public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        String name = FileHandler.readConsole();
        System.out.print("Enter your age: ");
        String age = FileHandler.readConsole();

        FileHandler.writeFile("src/content/output.txt", "Name: " + name + "\nAge: " + age);
    }
}
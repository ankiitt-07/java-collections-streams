import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number : ");
            int a = sc.nextInt();
            System.out.print("Enter the second number : ");
            int b = sc.nextInt();

            System.out.println(a/b);
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Operation completed!");
        }
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number : ");
            int n = sc.nextInt();
            System.out.print("Enter the second number : ");
            int m = sc.nextInt();

            System.out.println(n/m);
        }
        catch(ArithmeticException e) {
            System.out.println("Error:"+e.getMessage());
        }
        catch(InputMismatchException e) {
            System.out.println("Error : Please enter a number");
        }
    }
}
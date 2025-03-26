import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array : ");
            int n = sc.nextInt();
            int i = sc.nextInt();

            int[] arr = new int[n];
//            int[] arr = null;
            System.out.println(arr[i]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bounds : Please enter a valid index");
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException caught: Array is not initialized!");
        }
    }
}
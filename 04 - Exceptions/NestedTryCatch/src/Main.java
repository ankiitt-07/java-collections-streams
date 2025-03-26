public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int idx = 5;

        try {
            int element = arr[idx];
            int divisor =0;

            divisor = element / divisor;
            System.out.println(divisor);
        }
        catch (ArithmeticException e) {
            System.out.println("Error Caught : Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error Caught : Array index out of bounds!");
        }
    }
}
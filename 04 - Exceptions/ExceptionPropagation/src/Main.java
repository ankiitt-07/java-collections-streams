import com.interest_calculator.Interest;

public class Main {
    public static void main(String[] args) {
       try {
           double amount = -1400;
           double rate = 0.001;
           int years = 2;

           double interest = Interest.calculateInterest(amount, rate, years);
           System.out.printf("Calculated interest: %.2f%n", interest);
       }
       catch (IllegalArgumentException iae) {
           System.out.printf("Invalid Input : " + iae.getMessage());
       }

    }
}
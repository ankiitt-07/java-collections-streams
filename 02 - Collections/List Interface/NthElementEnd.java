package collections.list_interface;

import java.util.*;
import java.util.Scanner;

public class NthElementEnd {

    public static <T> T nthElement(List<T> list, int n) {
        int slow = 0, fast = n;

        try {
            while (list.get(fast) != null) {  // Ensure fast doesn't go out of bounds
                slow++;
                fast++;
            }
        } catch (IndexOutOfBoundsException e) {
            return list.get(slow); // Return the Nth element from the end
        }

        return null; // This should never happen, but just in case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // Read size of list

        LinkedList<String> al = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            al.add(String.valueOf((int) (Math.random() * 20))); // Generate random values
        }

        int n = (int) (Math.random() * k); // Ensure n is within the list size
        System.out.println("Original List -> " + al);
        System.out.println("N th element in this list from last is -> " + nthElement(al, n));

        sc.close();
    }
}

package collections.list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReverseList {
    public static <T> void reverseList(List<T> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) { // Should be i < j, not i <= j
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    public static <T> void display(List<T> list) { // Fixed method name
        for (T ele : list) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       /* ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            al.add((int) (Math.random() * 100)); // Generates random numbers between 0 and 99
        }*/

        LinkedList<String>al=new LinkedList<>();
        for(int i=0;i<n;i++){
            al.add(String.valueOf((int)(Math.random()*100)));
        }

        System.out.println("Original List:");
        display(al);

        reverseList(al);

        System.out.println("Reversed List:");
        display(al);

        sc.close(); // Close the scanner
    }
}

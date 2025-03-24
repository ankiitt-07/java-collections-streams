package collections.list_interface;

import java.util.*;
import java.util.Scanner;

public class RotateElements {
    public static <T> void rotate(List<T> list, int k) {
        int size = list.size();
        List<T> res = new ArrayList<>(Collections.nCopies(size, null)); // Create a list with `null` values

        // Placing elements in their rotated positions
        for (int i = 0; i < size; i++) {
            res.set((i + k+1) % size, list.get(i));
        }
        for (int i = 0; i < size; i++) {
            list.set(i, res.get(i));
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
        LinkedList<String> al=new LinkedList<>();
        for(int i=0;i<n;i++){
            al.add(String.valueOf((int)(Math.random()*100)));
        }
        int k=(int)(Math.random()*9);
        System.out.println("Original");
        display(al);
        rotate(al,k);
        System.out.println("Rotated " + "with K = "+k);
        display(al);
    }
}

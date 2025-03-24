package collections.list_interface;

import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static <T> ArrayList<T>removeDuplicates(List<T> list){
        ArrayList<T>al=new ArrayList<>();
        for(T ele:list){
            if(!al.contains(ele)){
                al.add(ele);
            }
        }
        return al;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<String> al = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            al.add(String.valueOf((int) (Math.random() * 20)));
        }
        System.out.println("Original List ->"+ al);
        ArrayList<?>all=removeDuplicates(al);
        System.out.println("Modified List ->"+ all);

    }
}

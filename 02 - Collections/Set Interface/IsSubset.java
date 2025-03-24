package collections.set_interface;

import java.util.*;

public class IsSubset{
    public static boolean checkSubset(HashSet<Integer> h1, HashSet<Integer> h2){
        for (int i : h1){
            if (!h2.contains(i)) return false;
        }
        return true;
    }

    public static void main(String[] args){
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();

        h1.add(2);
        h1.add(4);
        h2.add(2);
        h2.add(3);
        h2.add(5);

        System.out.println(checkSubset(h1, h2));
    }
}
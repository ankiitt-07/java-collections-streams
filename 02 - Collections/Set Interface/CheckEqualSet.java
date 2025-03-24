package collections.set_interface;

import java.util.*;

public class CheckEqualSet{

    public static boolean checkEqual(HashSet<Integer> h1, HashSet<Integer> h2){
        if (h1.equals(h2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        int[] arr = {1, 31, 319, 5, 67};

        for (int i = 0; i < arr.length; i++){
            hs1.add(arr[i]);
            hs2.add(arr[arr.length-i-1]);
        }

        System.out.println(checkEqual(hs1, hs2));
    }
}
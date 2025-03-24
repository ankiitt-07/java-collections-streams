package collections.set_interface;

import java.util.*;

public class SetToSortedList{
    public static List<Integer> convert(HashSet<Integer> hs){
        TreeSet<Integer> ts = new TreeSet<>(hs);

        return new ArrayList<>(ts);
    }


    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>();

        hs.add(300);
        hs.add(120);
        hs.add(56);
        hs.add(22);
        hs.add(49);
        hs.add(36);
        System.out.println(hs);
        System.out.println(convert(hs));
    }
}
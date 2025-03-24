package collections.set_interface;

import java.util.*;

public class SymmetricDifference {
    public static <T>void symmetricDifference(Set<T>hs1 , Set<T> hs2){
        Set<T> union = new TreeSet<>(hs1); // Initialize with ls1 elements
        union.addAll(hs2); // Add all elements of ls2 to get union

        List<T> intersection = new ArrayList<>();
        for (T k : hs1) {
            if (hs2.contains(k)) {
                intersection.add(k);
            }
        }
        for(T k:intersection){
            union.remove(k);
        }
        System.out.println("The symmetric difference is -> " + union);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer>hs2=new HashSet<>();
        for(int i=0;i<n;i++){
            hs1.add((int)(Math.random()*11));
            hs2.add((int)(Math.random()*11));
        }
        System.out.println("Original sets hs1 = "+hs1+" and hs2 = "+hs2);
        symmetricDifference(hs1,hs2);

    }
}

package collections.set_interface;

import java.util.*;

public class UnionAndIntersection {
    public static <T> void unionAndIntersection(Set<T> ls1, Set<T> ls2) {
        Set<T> union = new TreeSet<>(ls1); // Initialize with ls1 elements
        union.addAll(ls2); // Add all elements of ls2 to get union

        List<T> intersection = new ArrayList<>();
        for (T k : ls1) {
            if (ls2.contains(k)) {
                intersection.add(k);
            }
        }

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer>hs1=new HashSet<>();
        HashSet<Integer>hs2=new HashSet<>();
        for(int i=0;i<n;i++){
            hs1.add((int)(Math.random()*11));
            hs2.add((int)(Math.random()*11));
        }
        System.out.println("Original sets hs1 = "+hs1+" and hs2 = "+hs2);
        unionAndIntersection(hs1,hs2);

    }
}

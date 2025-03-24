package collections.list_interface;

import java.util.*;

public class FrequencyFinder {
    public static <T> Object[][] frequencyFinder(List<T> list) {
        HashMap<T, Integer> mp = new HashMap<>();

        for (T ele : list) {
            mp.put(ele, mp.getOrDefault(ele, 0) + 1);
        }

        // Creating a 2D array to store elements and their frequencies
        Object[][] result = new Object[mp.size()][2];
        int index = 0;

        for (Map.Entry<T, Integer> entry : mp.entrySet()) {
            result[index][0] = entry.getKey();   // Element
            result[index][1] = entry.getValue(); // Frequency
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            al.add((int) (Math.random() * 10)); // Random numbers from 0 to 9
        }

        System.out.println("Generated List: " + al);
        Object[][] arr = frequencyFinder(al);

        System.out.println("Element - Frequency:");
        for (Object[] pair : arr) {
            System.out.println(pair[0] + "\t ---> \t" + pair[1]);
        }

        sc.close();
    }
}

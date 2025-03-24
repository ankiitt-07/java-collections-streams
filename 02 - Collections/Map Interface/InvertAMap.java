package collections.map_interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.lang.System.out;

public class InvertAMap {
    public static HashMap<Integer, List<String>> invertMap(HashMap<String, Integer> mp) {
        HashMap<Integer, List<String>> mpp = new HashMap<>();

        for (var entry : mp.entrySet()) {
            int key = entry.getValue();
            String value = entry.getKey();

            // Get the list corresponding to the key or create a new one
            mpp.putIfAbsent(key, new ArrayList<>());
            mpp.get(key).add(value);
        }

        return mpp;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("apple", 1);
        mp.put("banana", 1);
        mp.put("kiwi", 1);
        mp.put("grapes", 2);
        mp.put("watermelon", 3);
        mp.put("dragon fruit", 2);
        mp.put("mango", 4);

        HashMap<Integer, List<String>> invertedMap = invertMap(mp);
        out.println(invertedMap);
    }
}

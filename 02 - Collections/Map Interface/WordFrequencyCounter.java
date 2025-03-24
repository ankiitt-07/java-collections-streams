import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class WordFrequencyCounter {
    public static void frequencyCounter(String[] str){
        HashMap<String, Integer>mp=new HashMap<>();
        for(String st :str){
            st = st.toLowerCase(); // Convert to lowercase to count words case-insensitively
            mp.put(st, mp.getOrDefault(st, 0) + 1);
        }
        for (var entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] st=sc.nextLine().split(" ");
        frequencyCounter(st);
    }
}

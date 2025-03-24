package collections.queue_interface;

import java.util.*;

public class BinaryNumbers{
    public static void findBinaryNumbers(int k){
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < k; i++) {
            String binary = queue.remove();
            result.add(binary);

            queue.add(binary + "0");
            queue.add(binary + "1");
        }

        for (String s : result){
            System.out.println(s);
        }
    }

    public static void main(String[] args){
        findBinaryNumbers((int)(Math.random()*10));
    }
}
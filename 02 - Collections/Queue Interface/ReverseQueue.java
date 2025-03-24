package collections.queue_interface;

import java.util.*;

public class ReverseQueue {
    public static <T> void recursionReverse(Queue<T> queue) {// reverse using recursion
        if (queue.isEmpty()) {
            return;
        }
        T front = queue.remove();
        recursionReverse(queue);
        queue.add(front);
    }
    public static <T> void stackReverse(Queue<T> queue) { // reverse using stack efficient for large inputs
        Stack<T> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Random random=new Random();
        Queue<Integer>qu=new LinkedList<>();
        for(int i=0;i<n;i++){
            qu.add(10 + random.nextInt(60));
        }
        System.out.println("Original queue -> " + qu);
        recursionReverse(qu);
        System.out.println("Reversed queue -> " + qu);
    }
}

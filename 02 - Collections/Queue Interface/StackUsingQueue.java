package collections.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

class StaQu<T> {
    Queue<T> qu;

    public StaQu() {
        this.qu = new LinkedList<>();
    }

    // Push operation: Insert element and rotate the queue
    public void push(T data) {
        qu.add(data);
        int size = qu.size();
        for (int i = 0; i < size - 1; i++) {
            qu.add(qu.remove());  // Rotate to make the last inserted element the front
        }
    }

    // Pop operation: Removes the top element (front of queue)
    public T pop() {
        if (qu.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return qu.remove();
    }

    // Peek operation: Returns the top element without removing it
    public T peek() {
        if (qu.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return qu.peek();
    }

    // Display the stack elements
    public void display() {
        System.out.println("Stack elements (top to bottom): " + qu);
    }
}

public class StackUsingQueue {
    public static void main(String[] args) {
        StaQu<Integer> stack = new StaQu<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();  // Output: [30, 20, 10]

        System.out.println("Top Element: " + stack.peek());  // Output: 30
        System.out.println("Popped Element: " + stack.pop()); // Output: 30

        stack.display();  // Output: [20, 10]
    }
}

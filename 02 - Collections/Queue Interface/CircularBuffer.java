package collections.queue_interface;
import static java.lang.System.out;
class CircularBufferD {
    private final int[] buffer;
    private int head = 0;
    private int size = 0;
    private final int capacity;

    public CircularBufferD(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
    }

    public void insert(int value) {
        buffer[head] = value;
        head = (head + 1) % capacity;
        if (size < capacity) size++;
    }

    public void printBuffer() {
        System.out.print("Buffer: [");
        for (int i = 0; i < size; i++) {
            int index = (head + i) % capacity;
          out.println(buffer[index] + (i < size - 1 ? ", " : "")); //with statically importing
        }
        System.out.println("]");
    }
}

public class CircularBuffer {
    public static void main(String[] args) {
        CircularBufferD cb = new CircularBufferD(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.printBuffer(); // [1, 2, 3]

        cb.insert(4);
        cb.printBuffer(); // [2, 3, 4]

    }
}
import tasks.ReaderTask;
import tasks.WriterTask;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        // Create and start writer and reader threads
        Thread writerThread = new Thread(new WriterTask(pos));
        Thread readerThread = new Thread(new ReaderTask(pis));

        writerThread.start();
        readerThread.start();
    }
}
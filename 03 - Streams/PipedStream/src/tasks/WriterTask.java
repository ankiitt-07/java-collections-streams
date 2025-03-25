package tasks;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PipedOutputStream;

public class WriterTask implements Runnable {
    private final PipedOutputStream pos;

    public WriterTask(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(pos))) {
            String[] messages = {
                    "Hello from writer thread!",
                    "This is a test message.",
                    "Java piped streams are fun!",
                    "Bye!"
            };
            for (String msg : messages) {
                writer.write(msg);
                writer.newLine();
                writer.flush();
                Thread.sleep(500);
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Writer error: " + e.getMessage());
        }
    }
}

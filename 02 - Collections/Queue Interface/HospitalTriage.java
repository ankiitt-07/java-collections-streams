package collections.queue_interface;

import java.util.*;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class HospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>(
                (a, b) -> b.severity - a.severity
        );

        queue.add(new Patient("Ankit", 3));
        queue.add(new Patient("Amit", 5));
        queue.add(new Patient("Anmol", 2));

        System.out.println("Treatment order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

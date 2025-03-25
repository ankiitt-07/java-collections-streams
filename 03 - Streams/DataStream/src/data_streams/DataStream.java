package data_streams;

import student.Student;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStream {
    public static void storeData(String src, Student student) {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(src))) {
            out.writeUTF(student.getName());
            out.writeInt(student.getRollNumber());
            out.writeDouble(student.getGpa());
            System.out.println("Data saved to " + src);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Student getData(String src) {
        Student student = null;
        try (DataInputStream in = new DataInputStream(new FileInputStream(src))) {
            String name = in.readUTF();
            int rollNumber = in.readInt();
            double gpa = in.readDouble();
            student = new Student(name, rollNumber, gpa);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return student;
    }
}

import data_streams.DataStream;
import student.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Anmol", 210, 9.2);

        DataStream.storeData("src/content/data.dat", s1);

        Student s2 = DataStream.getData("src/content/data.dat");

        System.out.println(s1);
        System.out.println(s2);
    }
}
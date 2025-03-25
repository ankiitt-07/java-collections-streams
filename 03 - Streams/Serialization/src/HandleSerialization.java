import employee.Employee;

import java.io.*;
import java.util.List;

public class HandleSerialization {
    public static void serialize(String filePath, List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(employees);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Employee> deserialize(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (List<Employee>) ois.readObject();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}

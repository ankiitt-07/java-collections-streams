import employee.Employee;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Alice", "HR"),
                new Employee(2, "Bob", "IT"),
                new Employee(3, "Carol", "Finance")
        );

        HandleSerialization.serialize("src/serialized/employees.ser", employeeList);

        List<Employee> loadedEmployees = HandleSerialization.deserialize("src/serialized/employees.ser");

        assert loadedEmployees != null;
        for (Employee employee : loadedEmployees) {
            System.out.println(employee);
        }
    }
}
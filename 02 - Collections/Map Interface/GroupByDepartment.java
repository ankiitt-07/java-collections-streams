package collections.map_interface;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        // Grouping employees by department
        Map<String, List<Employee>> groupedByDept = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.department));

        // Printing the result
        groupedByDept.forEach((dept, empList) ->
                System.out.println(dept + ": " + empList)
        );
    }
}

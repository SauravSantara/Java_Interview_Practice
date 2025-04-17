package StreamAPI;

import Root.Employee;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Top3Salaries {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "F", "HR", 50000));
        employees.add(new Employee(2, "Bob", "M", "IT", 75000));
        employees.add(new Employee(3, "Charlie", "M", "Finance", 60000));
        employees.add(new Employee(4, "David", "M", "IT", 80000));
        employees.add(new Employee(5, "Eve", "F", "Marketing", 55000));

        
        // Logic using streams
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .forEach(System.out::println);
    }
}
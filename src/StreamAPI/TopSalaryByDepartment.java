//Find 3rd Highest Salary from IT Department

package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Root.Employee;

public class TopSalaryByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "F", "HR", 50000));
        employees.add(new Employee(2, "Bob", "M", "IT", 75000));
        employees.add(new Employee(3, "Charlie", "M", "HR", 60000));
        employees.add(new Employee(4, "David", "M", "IT", 80000));
        employees.add(new Employee(5, "Eve", "F", "IT", 55000));

        
        // Logic using streams
        employees.stream()
                .filter(d -> "IT".equals(d.getDepartment()))
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(2)
                .findFirst()
                .ifPresent(System.out::println);
    }
}

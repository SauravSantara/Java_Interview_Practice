package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Top3Salaries {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "HR", 50000),
            new Employee(2, "Bob", "IT", 75000),
            new Employee(3, "Charlie", "Finance", 60000),
            new Employee(4, "David", "IT", 80000),
            new Employee(5, "Eve", "Marketing", 55000),
            new Employee(6, "Frank", "Finance", 72000),
            new Employee(7, "Grace", "HR", 68000),
            new Employee(8, "Heidi", "IT", 79000),
            new Employee(9, "Ivan", "Finance", 73000),
            new Employee(10, "Judy", "Marketing", 61000)
        );

        // Logic using streams
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .forEach(System.out::println);
    }
}

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}
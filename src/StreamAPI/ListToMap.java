/*
// Java program to convert a list of Employee objects to a map
// using Stream API
// Where the key is the gender and the count of employees is the value

Employee(id, name, gender, department, salary)
List<Employee> empList.add = new ArrayList<>();
 
empList.add(new Employee(1, "abc",  "F", "HR", 100000));
empList.add(new Employee(2, "xyz",  "F", "HR", 200000));
empList.add(new Employee(3, "efg", "M", "HR", 300000));
empList.add(new Employee(4, "def", "F", “IT”, 400000));
 */
package StreamAPI;

import Root.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
 
        empList.add(new Employee(1, "abc",  "F", "HR", 100000));
        empList.add(new Employee(2, "xyz",  "F", "HR", 200000));
        empList.add(new Employee(3, "efg", "M", "HR", 300000));
        empList.add(new Employee(4, "def", "F", "IT", 400000));

        Map<String, Long> genderMap = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(genderMap);
    }
}
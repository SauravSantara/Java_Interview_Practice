package Root;

public class Employee {
    private Integer id;
    private String name;
    private String gender;
    private String department;
    private Integer salary;

    public Employee(Integer id, String name, String gender, String department, Integer salary) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.department = department;
            this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Gender: " + gender + ", Department: " + department + ", Salary: " + salary;
    }
}

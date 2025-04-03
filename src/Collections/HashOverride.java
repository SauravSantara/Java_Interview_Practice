package Collections;

import java.util.HashMap;
import java.util.Objects;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Employee emp = (Employee) obj;
        return id == emp.id && Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class HashOverride {
    
    public static void main(String[] args) {
        HashMap<Employee, String> empMap = new HashMap<>();
        
        Employee e1 = new Employee(1, "Kshitij");
        Employee e2 = new Employee(2, "Manas");

        empMap.put(e1, "QA");
        empMap.put(e2, "CFE");

        System.out.println("e1 = " + empMap.get(e1));
        System.out.println("e1 = " + empMap.get(e2));
        System.out.println("equals = " + empMap.get(e1).equals(empMap.get(e2)));
        System.out.println("hashCode = " + empMap.get(e1).hashCode() + " " + empMap.get(e2).hashCode());
        System.out.println("size = " + empMap.size());
    }
}

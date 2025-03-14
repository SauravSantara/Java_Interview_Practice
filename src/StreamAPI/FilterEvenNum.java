package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNum {
    
    public static void main(String[] args) throws Exception {
        // Creating an ArrayList object of Integer type 
        ArrayList<Integer> al = new ArrayList<Integer>();
        // Inserting integers to ArrayList
        al.add(1); 
        al.add(5);
        al.add(6);
        al.add(11);
        al.add(2);
        al.add(8);

        // print the collection with raw data
        System.out.println("ArrayList : " + al);

        // stream operation
        // 1. Get a stream from ArrayList
        // 2. Filter only even elements
        // 3. Collect the required elements to List
        List<Integer> li = al.stream().filter(i -> i%2 == 0).collect(Collectors.toList());

        // pint the collection after stream operation
        System.out.println("List : " + li);
    }
}

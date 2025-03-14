package Collections;


import java.util.Comparator;
import java.util.TreeMap;

public class ReverseSortedMapValue {
    public static void main (String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "Ninety Nine");
        treeMap.put(7, "Ninety Three");
        treeMap.put(21, "Seventy Nine");
        treeMap.put(4, "Ninety Six");
        treeMap.put(15, "Eighty Five");

        treeMap.values().stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}

package Collections;

import java.util.Map;
import java.util.TreeMap;

public class ReverseTreeMap {
    public static void main (String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "Ninety Nine");
        treeMap.put(7, "Ninety Three");
        treeMap.put(21, "Seventy Nine");
        treeMap.put(4, "Ninety Six");
        treeMap.put(15, "Eighty Five");

        for (Map.Entry<Integer, String> entry : treeMap.descendingMap().entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

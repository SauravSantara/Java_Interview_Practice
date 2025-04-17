package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStream {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        List<String> list2 = new ArrayList<>();
        list2.add("D");
        list2.add("E");
        list2.add("F");

        List<String> mergedList = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
        System.out.println("Merged List: " + mergedList);
    }
}

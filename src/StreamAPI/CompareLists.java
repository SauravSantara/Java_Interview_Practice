package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompareLists {
    public static void main(String[] args) {
        List <Integer> list1 = Arrays.asList(1,2,5,6,8,9);
        List <Integer> list2 = Arrays.asList(2,6,9);

        List <Integer> missing = list1.stream()
                                    .filter(l -> !list2.contains(l))
                                    .collect(Collectors.toList());
        System.out.println("Missing elements are: " + missing);
    }
}

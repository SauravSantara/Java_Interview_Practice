package StreamAPI;


import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    public static void main (String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,6,7,8);
        list.stream()
        .filter(l -> l % 2 == 0)
        .forEach(System.out::println);
    }
}

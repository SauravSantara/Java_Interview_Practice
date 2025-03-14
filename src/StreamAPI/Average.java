package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Average {
    public static void main (String[] args) {
        List<Integer> list = Arrays.asList(10,22,35,74,69,81);

        list.stream()
        .mapToInt(Integer::intValue)
        .average()
        .ifPresent(System.out::println);
    }
}

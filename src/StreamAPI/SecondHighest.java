package StreamAPI;
// Find the second highest number from a List of Integer
// Using java 8 streams
// 2,5,4,3,1

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,4,3,1);
        Integer secondHighest = list.stream()
                .sorted(Collections.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondHighest);

        // OR using Optional to handle null values
        Optional<Integer> secondHighestOptional = list.stream()
                .distinct()
                .sorted((a, b) -> b - a) // Using another way to sort in reverse order
                .skip(1)
                .findFirst();
        
        secondHighestOptional.ifPresentOrElse(
            System.out::println,
            () -> System.out.println("No second highest value found")
        );
    }
}

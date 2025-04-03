package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

// Print only the non-null and not-empty values from a List of String
// Using java 8 streams
// "a",null,"","b"
public class NonNullString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a",null,"","b");
        List<String> nonNullList = list.stream()
                .filter(Objects::nonNull)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        System.out.println(nonNullList);
    }
}
// Find the first non-repeating character in a string
// Using Stream API

package StreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "asimkumar";
        System.out.println(firstNonRepeatingChar(str));
    }

    public static char firstNonRepeatingChar(String str) {
        Character result = str.chars()  // Convert string to IntStream
            .mapToObj(c -> (char) c)  // Convert int to Character
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Count occurrences
            .entrySet().stream()
            .filter(entry -> entry.getValue() == 1) // Find first entry with count 1
            .map(Map.Entry::getKey)
            .findFirst()
            .orElse(null); // Return null if no unique character is found
        return result;
    }
}

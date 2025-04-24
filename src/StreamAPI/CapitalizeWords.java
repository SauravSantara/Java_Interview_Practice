package StreamAPI;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeWords {

    public static void main(String[] args) {
        String str = "hello world! welcome to java programming.";
        String capitalizedStr = capitalizeWords(str);
        System.out.println(capitalizedStr); // Output: Hello World! Welcome To Java Programming.
    }

    public static String capitalizeWords(String lowerStr) {
        String upperStr = Arrays.stream(lowerStr.split(" "))
            .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
            .collect(Collectors.joining(" "));

        return upperStr;
    }
    
}

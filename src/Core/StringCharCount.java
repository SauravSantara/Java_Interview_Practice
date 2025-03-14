package Core;

import java.util.HashMap;
import java.util.Map;

public class StringCharCount {
    public static void main(String[] args) {
        String s ="Apple";
        printCharachterCount(s);
    }

    public static void printCharachterCount (String s) {
        Map<Character, Integer> charCountMap = new HashMap<>(); 

        for (char c : s.toCharArray()) {
            char lowerCased = Character.toLowerCase(c); // If required to ignore case
            charCountMap.put(lowerCased, charCountMap.getOrDefault(lowerCased, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
    
}

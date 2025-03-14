package Core;
// Problem: Write a Java program that takes a string as input and returns its reverse without using built-in reverse functions.

public class RevStringFromBothSides {
    
    public static String reverseString(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Handle null or empty input
        }

        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String inputString = "hello world";
        String reversedString = reverseString(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reversedString);

        inputString = "";
        reversedString = reverseString(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reversedString);

        inputString = null;
        reversedString = reverseString(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reversedString);

        inputString = "1";
        reversedString = reverseString(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reversedString);

    }
}
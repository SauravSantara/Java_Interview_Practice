package Core;

public class SumOfInteger {
    public static int method1(int num) {
        int sum = 0;
        // split integers
        String str = String.valueOf(num);
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            // convert char to int
            int digit = Character.getNumericValue(chars[i]);
            // add to sum
            sum += digit;
        }
        return sum;
    }
    public static void main(String[] args) {
        int input = 12345;
        System.out.println("The sum of the digits in " + input + " is: " + SumOfInteger.method1(input));
    }
}

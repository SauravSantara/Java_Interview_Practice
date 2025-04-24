package Core;

public class SumOfTwoLowest {

    public static void main (String args[]) {
        int[] numbers = {10, 24, 9, -3, 5};

        System.out.println("The sum of the two lowest numbers is: " + calculateSum(numbers));
    }

    public static int calculateSum(int[] numbers) {
        int low1 = Integer.MAX_VALUE;
        int low2 = Integer.MAX_VALUE;

        for (int num: numbers) {
            if (num < low1) {
                low2 = low1;
                low1 = num;
            } else if (num < low2) {
                low2 = num;
            }
        }

        return low1 + low2;
    }
}
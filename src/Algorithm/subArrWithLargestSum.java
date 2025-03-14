package Algorithm;
// Problem: Given an array of integers, write a function that returns the sum of the contiguous subarray with the largest sum.
// Kadane's Algorithm
public class subArrWithLargestSum {
    public static int maxSubArray(int[] num) {
        if (num == null || num.length == 0) {
            return 0;
        }

        int maxSoFar = num[0];
        int maxEndingHere = num[0];

        for (int i = 1; i < num.length; i++) {
            // comparing to see if sub array should be continued or a new one should begin
            maxEndingHere = Math.max(num[i], maxEndingHere + num[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(input));
    }
}

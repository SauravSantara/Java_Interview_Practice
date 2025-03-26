package Algorithm;
/*
Given an array nums and an integer k, rotate the array to the right by k steps.
Input: nums = [1,2,3,4,5,6,7], k = 3 Output: [5,6,7,1,2,3,4]
// Reverse Method Algorithm
*/

import java.util.Arrays;

public class RotateRight {
        static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start ++;
            end --;
        }
    }
    public static void rotateRight(int[] nums, int k) {
        int len = nums.length;
        // Handle if k>nums.length
        reverse (nums, 0, len-1); // Reverse the entire array
        reverse (nums, 0, k-1); // Reverse the first k elements
        reverse (nums, k, len-1); // Reverse the rest of the elements
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k); // does not modify the original array
        rotateRight(nums, k);
        System.out.println(Arrays.toString(nums));

    }

    // another way
    public static void rotate(int[] arr, int key){
        
        int[] arrNew = new int[arr.length];
        int arrLen = arr.length;
        int sub = key;
        
        for(int i = 0; i<sub; i++) {
            arrNew[i] = arr[arrLen-key];
            key--;
        }
        
        for(int j = sub; j<arrLen; j++) {
            arrNew[j] = arr[key];
            key++;
        }
        
        System.out.println(Arrays.toString(arrNew));
    }
}

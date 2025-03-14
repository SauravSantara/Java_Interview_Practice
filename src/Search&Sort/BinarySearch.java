// Problem: Write a Java function that performs a binary search on a sorted array. The function should return the index of the target element if found, or -1 otherwise.
// Example:
// Input: Array = [1, 2, 3, 4, 5], Target = 3
// Output: 2

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        // if emtly or null array is passed
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int left = 0;
        int right = arr.length -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("mid = " + mid + ", left = " + left + ", right = " + right);

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1; // search in right half
            } else {
                right = mid - 1; // search in left half
            }
        }
        // if target not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("print array " + Arrays.toString(arr1));
        int target1 = 3;
        System.out.println("Index of " + target1 + ": " + binarySearch(arr1, target1)); // Output: 2

        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println("print array " + Arrays.toString(arr2));
        int target2 = 25;
        System.out.println("Index of " + target2 + ": " + binarySearch(arr2, target2)); // Output: -1

        int[] arr3 = {1};
        System.out.println("print array " + Arrays.toString(arr3));
        int target3 = 1;
        System.out.println("Index of " + target3 + ": " + binarySearch(arr3, target3)); // Output: 0

        int[] arr4 = {1, 2};
        System.out.println("print array " + Arrays.toString(arr4));
        int target4 = 2;
        System.out.println("Index of " + target4 + ": " + binarySearch(arr4, target4)); //output: 1

        int[] arr5 = {1,2,3,4,5,6};
        System.out.println("print array " + Arrays.toString(arr5));
        int target5 = 6;
        System.out.println("Index of " + target5 + ": " + binarySearch(arr5, target5)); //output: 5

        int[] arr6 = {1,2,3,4,5,6};
        System.out.println("print array " + Arrays.toString(arr6));
        int target6 = 1;
        System.out.println("Index of " + target6 + ": " + binarySearch(arr6, target6)); //output: 0

        int[] arr7 = null;
        System.out.println("print array " + Arrays.toString(arr7));
        int target7 = 1;
        System.out.println("Index of " + target7 + ": " + binarySearch(arr7, target7)); //output: -1

        int[] arr8 = {};
        System.out.println("print array " + Arrays.toString(arr8));
        int target8 = 1;
        System.out.println("Index of " + target8 + ": " + binarySearch(arr8, target8)); //output: -1
    }
}

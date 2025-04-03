// Problem: Given two sorted arrays, write a Java program to merge them into a single sorted array.
package SearchAndSort;

import java.util.Arrays;

public class MergeSortedArrays {
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        if (arr1 == null || arr1.length == 0) {
            return arr2 == null ? new int[0] : arr2.clone();
        }
        if (arr2 == null || arr2.length == 0) {
            return arr1.clone();
        }

        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2 [j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr1[j++];
            }
        }

        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }
        
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] merged = mergeSortedArrays(arr1, arr2);
        System.out.println(Arrays.toString(merged)); // Output: [1, 2, 3, 4, 5, 6]

        int[] arr3 = {1,2,3};
        int[] arr4 = {};
        merged = mergeSortedArrays(arr3, arr4);
        System.out.println(Arrays.toString(merged)); //output: [1,2,3]

        int[] arr5 = {};
        int[] arr6 = {1,2,3};
        merged = mergeSortedArrays(arr5, arr6);
        System.out.println(Arrays.toString(merged)); //output: [1,2,3]

        int[] arr7 = {};
        int[] arr8 = {};
        merged = mergeSortedArrays(arr7, arr8);
        System.out.println(Arrays.toString(merged)); //output: []

        int[] arr9 = null;
        int[] arr10 = {1,2,3};
        merged = mergeSortedArrays(arr9, arr10);
        System.out.println(Arrays.toString(merged)); //output: [1,2,3]

        int[] arr11 = {1,2,3};
        int[] arr12 = null;
        merged = mergeSortedArrays(arr11, arr12);
        System.out.println(Arrays.toString(merged)); //output: [1,2,3]

        int[] arr13 = null;
        int[] arr14 = null;
        merged = mergeSortedArrays(arr13, arr14);
        System.out.println(Arrays.toString(merged)); //output: []
    }
}

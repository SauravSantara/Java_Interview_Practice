package SearchAndSort;

import java.util.Arrays;

public class ParallelSorting {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 9, 2};
        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

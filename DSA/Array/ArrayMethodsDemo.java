package DSA.Array;

import java.util.Arrays;

public class ArrayMethodsDemo {

    public static void main(String[] args) {

        // Original array
        int[] arr = {5, 2, 8, 1, 9};

        // toString()
        System.out.println("Original: " + Arrays.toString(arr));

        // sort()
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        // binarySearch()
        int index = Arrays.binarySearch(arr, 8);
        System.out.println("8 found at index: " + index);

        // fill()
        int[] filled = new int[5];
        Arrays.fill(filled, 10);
        System.out.println("Filled array: " + Arrays.toString(filled));

        // copyOf()
        int[] copy = Arrays.copyOf(arr, 7);
        System.out.println("copyOf: " + Arrays.toString(copy));

        // copyOfRange()
        int[] range = Arrays.copyOfRange(arr, 1, 4);
        System.out.println("copyOfRange: " + Arrays.toString(range));

        // equals()
        int[] another = {1, 2, 5, 8, 9};
        System.out.println("Arrays equal: " + Arrays.equals(arr, another));

        // compare()
        int[] x = {1, 2, 3};
        int[] y = {1, 2, 4};
        System.out.println("compare(): " + Arrays.compare(x, y));

        // mismatch()
        System.out.println("mismatch(): " + Arrays.mismatch(x, y));

        // setAll()
        int[] squares = new int[5];
        Arrays.setAll(squares, i -> i * i);
        System.out.println("setAll(): " + Arrays.toString(squares));

        // parallelSort()
        int[] nums = {9, 4, 7, 2, 1};
        Arrays.parallelSort(nums);
        System.out.println("parallelSort(): " + Arrays.toString(nums));

        // deepToString()
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        System.out.println("deepToString(): " + Arrays.deepToString(matrix));

        // length property
        System.out.println("Length: " + arr.length);
    }
}

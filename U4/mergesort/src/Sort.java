/*
 * Sort.java
 * Leo Bogaert
 * June 12, 2024
 * This class contains the merge sort algorithm
 */

import java.util.Arrays;

public class Sort {

    /**
     * Merge sort algorithm
     * @param arr int[] array to be sorted
     * @return int[] sorted array
     */
    public static int[] mergeSort (int[] arr){
        if (arr.length == 1) // base case
            return arr;

        // split arrays and merge
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left, right);
    }

    /**
     * Merge and sort two arrays
     * @param left int[] array left side
     * @param right int[] array right side
     * @return int[] merged and sorted array
     */
    private static int[] merge (int[] left, int[] right){
        int[] temp = new int[left.length + right.length]; // copy of the array

        int leftCounter = 0, rightCounter = 0, currentValue = 0;

        while (leftCounter < left.length && rightCounter < right.length){
            if (left[leftCounter] > right[rightCounter]){
                temp[currentValue] = left[leftCounter];
                leftCounter++;
            } else {
                temp[currentValue] = right[rightCounter];
                rightCounter++;
            }
            currentValue++;
        }

        // clean up left and right arrays
        while (leftCounter < left.length){
            temp[currentValue] = left[leftCounter];
            leftCounter++;
            currentValue++;
        }
        while (rightCounter < right.length){
            temp[currentValue] = right[rightCounter];
            rightCounter++;
            currentValue++;
        }
        return temp;
    }


    /**
     * Radix sort algorithm
     * @param arr int[] array to be sorted
     * @return int[] sorted array
     */
    public static int[] radixSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        // Find the maximum number to determine the number of digits
        int max = getMax(arr);

        // Perform counting sort for each digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            arr = countingSortByDigit(arr, exp);
        }

        return arr;
    }

    // Helper method to get the maximum value in the array
    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Helper method to perform counting sort based on a specific digit
    private static int[] countingSortByDigit(int[] arr, int exp) {
        int[] output = new int[arr.length];
        int[] count = new int[10]; // Digits range from 0 to 9

        // Count occurrences of each digit
        for (int num : arr) {
            int digit = (num / exp) % 10;
            count[digit]++;
        }

        // Update count[i] to store the position of the digit in the output array
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = arr.length - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        return output;
    }
}

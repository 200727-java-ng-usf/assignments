package com.revature;
import java.util.Arrays;

public class Q1 {
    /**    Q1. Perform a bubble sort on the following integer array:  1,0,5,6,3,2,3,7,9,8,4
     *
     * @param arr is the array with integer values to be passed from Q1Test.java and tested in Q1.java
     * @return the sorted integer array, otherwise might return an empty array
     */
    public int[] sort(int[] arr) {

        // check for the edge cases
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        // make a copy of the original array, this copy will be sorted instead of the original
        int[] copy = Arrays.copyOf(arr, arr.length);
        // sort the array
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                //if current number on the left is bigger than on the right, swap
                if (copy[j] > copy[j + 1]) {
                    // swap the values
                    int temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                }
            }
        }
        return copy;
    }
}
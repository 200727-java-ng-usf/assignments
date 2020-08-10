package com.revature.questions;

public class Q2Fibonacci {
    //    Q2. Write a program to display the first 25 Fibonacci numbers beginning at 0.
    /*
    int[] arr       the input array of size n that gets populated with the n fibonacci numbers
    int n           the number of fibonacci numbers to populate arr with
 */

    /**
     * Populates and returns a new int[] with every fibonacci number from fib(0) to fib(n).
     *
     * @param arr the int[] to be populated.
     * @param n the index in arr at which to stop populating with fibonacci numbers.
     * @return The passed in array arr. Exceptions to this include the following:<br>
     * <br><p>If arr is null, if arr.length <= 0, or if n <= 0, this method returns a new int[]{}.</p>
     * <br><p>If arr.length < n, this method sets n to arr.length and returns arr populated to its capacity.</p>
     * <br><p>If arr.length > n, this method returns arr populated to the nth index with fibonacci numbers. The remaining indices are not changed.</p>
     */
    public int[] fibonacci(int[] arr, int n) {
        if (arr == null || arr.length <= 0 || n <= 0) return new int[]{};
        if(arr.length < n) {
            n = arr.length;
        }
        arr[0] = 0;
        if (arr.length < 2 || n < 2) return arr;
        arr[1] = 1;
        if (arr.length < 3 || n < 3) return arr;
        int sum = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = sum;
            sum = arr[i - 1] + arr[i];
        }
        return arr;
    }
}

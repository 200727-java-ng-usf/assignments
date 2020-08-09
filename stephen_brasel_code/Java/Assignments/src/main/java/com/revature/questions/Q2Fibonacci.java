package com.revature.questions;

public class Q2Fibonacci {
    //    Q2. Write a program to display the first 25 Fibonacci numbers beginning at 0.
    /*
    int[] arr       the input array of size n that gets populated with the n fibonacci numbers
    int n           the number of fibonacci numbers to populate arr with
 */
    public int[] fibonacci(int[] arr, int n) {
        if (arr == null || arr.length <= 0 || n <= 0) return new int[]{};
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

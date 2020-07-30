package com.revature.questions;


import java.util.Arrays;

public class Q12EnhancedFor {
//    Q12. Write a program to store numbers from 1 to 100 in an array.
//    Print out all the even numbers from the array.
//    Use the enhanced FOR loop for printing out the numbers.
    private int[] arr;
    public Q12EnhancedFor(int n){
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
    }
    public void enhancedFor(){
        for (int val : arr) {
            System.out.println(val);
        }
    }
}

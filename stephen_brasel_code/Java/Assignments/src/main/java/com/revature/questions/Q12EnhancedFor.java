package com.revature.questions;


import java.util.Arrays;

public class Q12EnhancedFor {
//    Q12. Write a program to store numbers from 1 to 100 in an array.
//    Print out all the even numbers from the array.
//    Use the enhanced FOR loop for printing out the numbers.
    private int[] arr;

    public int[] getArrEven() {
        return arrEven;
    }

    private int[] arrEven;

    public Q12EnhancedFor() {
        this(100);
    }

    public Q12EnhancedFor(int n){
        arr = new int[n];
        arrEven = new int[n/2];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            if((i+ 1) % 2 == 0){
                arrEven[i/2] = (i+ 1);
            }
        }
    }
    public void enhancedFor(){
        boolean firstElem = true;
        for (int val : arr) {
            if(val % 2 == 0) {
                if(!firstElem){
                    System.out.print(", ");
                } else{
                    firstElem = false;
                }
                System.out.print(val);
            }
        }
    }
}

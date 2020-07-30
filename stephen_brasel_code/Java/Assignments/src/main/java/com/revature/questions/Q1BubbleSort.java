package com.revature.questions;

public class Q1BubbleSort {
    //    Q1. Perform a bubble sort on the following integer array:  1,0,5,6,3,2,3,7,9,8,4
    public Q1BubbleSort() {
    }

    public void BubbleSort(int[] arr) {
        boolean sorted;
        int i = 0, temp = 0;
        do {
            sorted = true;
            for (i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    //swap
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    //set check
                    sorted = false;
                }
            }
        } while (!sorted);
    }
}

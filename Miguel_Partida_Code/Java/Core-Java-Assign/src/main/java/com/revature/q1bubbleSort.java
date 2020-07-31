package com.revature;

public class q1bubbleSort {


//this is the bubble sort question
    static void bubbleSort(int[] arr){
        //length of the array
        int n = arr.length;
        //these here are the accumulator
        int i,j;
        int temp;

        for(i = 0; i < n;i++){
            for(j = 1; j < n-1; j++){
                if(arr[j-1] >= arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}

package com.revature;

public class Q1{
    public static void bubbleSort(int[] arr){

        int n = arr.length;
        boolean sorted = true;

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    sorted = false;

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(sorted) return;
            sorted = true;
        }
    }
}
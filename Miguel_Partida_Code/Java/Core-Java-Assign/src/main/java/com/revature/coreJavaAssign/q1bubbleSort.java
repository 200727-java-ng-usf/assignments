package com.revature.coreJavaAssign;

import java.util.Arrays;

public class q1bubbleSort {



//this is the bubble sort question
    static int[] q1bubbleSort(int[] arr) {

        //this will edge case empty Arrays
        if(arr ==null){
            return arr;
        }

        //length of the array
        int n = arr.length;
        //these here are the accumulator
        int i, j;
        int temp;


        //the iterations is - 1 of the length of the array
        for (i = 0; i < n - 1; i++) {
            // this is the inner loop
            for (j = 0; j < n - i - 1; j++) {
                //this will compare two indexes next to each other
                if (arr[j] > arr[j + 1]) {
                    //if the lower indexed integer is larger
                    //bellow will swap the integers
                    //this will happen until all numbers are form smallest to largest
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int k : arr) {
            System.out.print(k);
            //  System.out.println("This is the sorted Array");
            //  System.out.println(Arrays.toString(arr));

        }
        return arr;

    }
}





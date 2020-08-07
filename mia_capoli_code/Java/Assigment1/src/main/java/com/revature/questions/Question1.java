package com.revature.questions;

import java.util.Arrays;

public class Question1 {

    public int[] bubbleSort(int[] arr) {
        //check if the array is nothing or has zero values
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        //copying given array
        int[] q1Array = Arrays.copyOf(arr, arr.length);

        //looping through array to store the current value to be sorted
        for (int i = 0; i < q1Array.length; ++i) {

            //sorting the value by comparing it to every other value in the array
            for (int j = 0; j < q1Array.length - i && q1Array[j] != q1Array[q1Array.length - 1]; ++j) {

                //comparing value size to get the larger value, and if the fitst is larger, subsequently swapping them.
                if (q1Array[j] > q1Array[j + 1]) {
                    int current = q1Array[j];
                    q1Array[j] = q1Array[j + 1];
                    q1Array[j + 1] = current;
                }
            }
        }
        //return result
        return q1Array;

    }

}

package com.revature.questions;

import com.revature.Assignment1Driver;

public class Question1 {

    Assignment1Driver printvals = new Assignment1Driver();

    public int[] bubbleSort() {
        //Declaring given array
        int[] q1Array = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
        //looping through array to store the current value to be sorted
        for (int i = 0; i < q1Array.length; ++i) {
            //sorting the value by comparing it to every other value in the array
            for (int j = 0; j < q1Array.length - i && q1Array[j] != q1Array[q1Array.length - 1]; ++j) {
                //comparing value size to get the larger value and then subsequently swapping them.
                if (q1Array[j] > q1Array[j + 1]) {
                    int current = q1Array[j];
                    q1Array[j] = q1Array[j + 1];
                    q1Array[j + 1] = current;
                }
            }
        }
        printvals.printValues(q1Array);
        return q1Array;

    }

}

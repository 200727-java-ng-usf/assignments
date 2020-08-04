package com.revature.questions;

public class Question1 {


    public int[] bubbleSort() {
        int[] q1Array = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};

        for(int i = 0; i < q1Array.length; ++i) {
            for(int j = 0; j < q1Array.length - i && q1Array[j] != q1Array[q1Array.length - 1]; ++j) {
                if (q1Array[j] > q1Array[j + 1]) {
                    int current = q1Array[j];
                    q1Array[j] = q1Array[j + 1];
                    q1Array[j + 1] = current;
                }
            }
        }




        return q1Array;
    }

}

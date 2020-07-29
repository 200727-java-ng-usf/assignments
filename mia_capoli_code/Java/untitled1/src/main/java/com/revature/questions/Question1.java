package com.revature.questions;

import java.util.Arrays;

public class Question1 {

    private void printValues(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public void bubbleSort() {

        int[] q1Array = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};

        for (int i = 0; i < q1Array.length; i++) {
            int current;
            for (int j = 0; j < q1Array.length - i; j++) {
                if (q1Array[j] != q1Array[q1Array.length-1]) {
                    if (q1Array[j] > q1Array[j + 1]) {
                        current = q1Array[j];
                        q1Array[j] = q1Array[j + 1];
                        q1Array[j + 1] = current;
                    }

                } else {
                    break;
                }
            }
        }
        printValues(q1Array);
    }
}

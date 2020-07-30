package com.revature;

import java.util.Arrays;

public class Question1 {

    public static void answer(){

        int[] array = new int[]{1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};

        for (int i = 0; i < (array.length - 1); i++) {

            for (int j = 0; j < (array.length - i - 1); j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }

        System.out.println(Arrays.toString(array));

    }

    public static void main(String[] args) {

        answer();

    }

}

package com.revature;

public class Q1 {


    public Q1() {
    }


    public  int[] BubbleSort(int[] intArray) {
        int tmp;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    tmp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = tmp;
                }
            }
        }
        return intArray;
    }


    }

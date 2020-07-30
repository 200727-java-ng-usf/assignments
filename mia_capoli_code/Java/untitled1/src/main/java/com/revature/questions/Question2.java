package com.revature.questions;

public class Question2 {

    private void printValues(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public void fibonacciSequence() {
        int[] fibonacciArray = new int[25];
        for (int i = 0; i < 25; i++) {
            if (i == 0) {
                fibonacciArray[0] = 0;
            } else if (i == 1) {
                fibonacciArray[1] = 1;
            } else if (i == 2){
                fibonacciArray[2] = 1;
            } else {
                fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
            }
        }

        printValues(fibonacciArray);

    }
}

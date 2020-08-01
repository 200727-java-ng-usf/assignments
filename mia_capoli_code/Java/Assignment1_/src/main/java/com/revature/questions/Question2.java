package com.revature.questions;

import com.revature.Assignment1Driver;

public class Question2 {

    Assignment1Driver printValues = new Assignment1Driver();

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
        printValues.printValues(fibonacciArray);

    }
}

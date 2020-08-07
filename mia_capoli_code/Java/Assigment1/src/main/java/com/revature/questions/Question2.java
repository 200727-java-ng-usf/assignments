package com.revature.questions;

import com.revature.Assignment1Driver;

public class Question2 {
    // getting the utility method "print values"
    Assignment1Driver printValues = new Assignment1Driver();

    public void fibonacciSequence() {
        //initializing the array
        Integer[] fibonacciArray = new Integer[25];
        for (int i = 0; i < 25; ++i) {
            //inputting the first 3 numbers that are not easily calculated
            if (i == 0) {
                fibonacciArray[0] = 0;
            } else if (i == 1) {
                fibonacciArray[1] = 1;
            } else if (i == 2) {
                fibonacciArray[2] = 1;
                //adding the current value to the previous one to get the next number in the sequence.
            } else {
                fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            }
        }
        //printing the values.
        this.printValues.printObjs(fibonacciArray);
    }
}

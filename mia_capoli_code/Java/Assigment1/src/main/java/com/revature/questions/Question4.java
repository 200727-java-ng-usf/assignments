package com.revature.questions;

public class Question4 {

    int temp = 0;
    int stored = 1;

    public int computeFactorial(int factorialSize) {
        //calculates a factorial by multiplying the stored value by the next number in the factorial pattern
        for (int i = 1; i < factorialSize; i++) {
            temp = i;
            stored *= temp + 1;
        }
        int factorialFinal = stored;
        return stored;
    }

}

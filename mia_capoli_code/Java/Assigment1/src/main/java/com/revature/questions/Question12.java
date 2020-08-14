package com.revature.questions;

import com.revature.questions.extras.Utils;

public class Question12 {
    public int[] getEvenNumbers(int arrSize) {
        int[] numbers = new int[arrSize];
        int[] evenNumbers = new int[arrSize / 2];

        for (int i = 0; i < arrSize; i++ ) {
            numbers[i] =  i + 1;
        }
        int index = 0;
        for (int i: numbers) {
            if (i % 2 == 0){
                evenNumbers[index] = i;
                index++;
            }
        }
//        Utils.printValues(evenNumbers);
        return evenNumbers;
    }
}

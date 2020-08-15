package com.revature.questions;

import com.revature.questions.extras.Utils;

public class Question12 {
    public int[] getEvenNumbers(int arrSize) {

        //initalize properly sized arrays
        int[] numbers = new int[arrSize];
        int[] evenNumbers = new int[arrSize / 2];

        //insert proper numbers
        for (int i = 0; i < arrSize; i++ ) {
            numbers[i] =  i + 1;
        }
        //check if number is even and store it if so
        int index = 0;
        for (int i: numbers) {
            if (i % 2 == 0){
                evenNumbers[index] = i;
                index++;
            }
        }
        //return even numbers.
        Utils.printValues(evenNumbers);
        return evenNumbers;
    }
}

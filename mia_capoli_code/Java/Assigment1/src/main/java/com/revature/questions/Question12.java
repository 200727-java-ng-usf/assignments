package com.revature.questions;

public class Question12 {
    public void getEvenNumbers() {
        int[] evenNumbers = new int[100];
        for (int i = 0; i < 100; i++ ) {
            evenNumbers[i] =  i + 1;
        }
        for (int i: evenNumbers) {
            if (i % 2 == 0){
                System.out.println(evenNumbers[i-1]);
            }
        }

    }
}

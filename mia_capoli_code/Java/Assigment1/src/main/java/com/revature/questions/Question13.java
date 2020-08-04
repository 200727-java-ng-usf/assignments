package com.revature.questions;

public class Question13 {
    public void pyramid(){
        int[] evenNumbers = new int[10];
        for (int i = 0; i < 10; i++ ) {
            if (i % 2 == 0) {
                evenNumbers[i] = 0;
            } else {
                evenNumbers[i] = 1;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.println(evenNumbers[i]);
            } else if (i == 1) {

                System.out.print(evenNumbers[i]);
                System.out.println(evenNumbers[i + 1]);
            } else if (i == 3) {
                System.out.print(evenNumbers[i]);
                System.out.print(evenNumbers[i + 1]);
                System.out.println(evenNumbers[i + 2]);
            } else if (i == 6) {
                System.out.print(evenNumbers[i]);
                System.out.print(evenNumbers[i + 1]);
                System.out.print(evenNumbers[i + 2]);
                System.out.print(evenNumbers[i + 3]);
            }
        }
    }
}

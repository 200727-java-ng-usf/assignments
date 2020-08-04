package com.revature.questions;

import java.util.ArrayList;

public class Question9 {

    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<Integer> primeNumbers = new ArrayList<>();

    public void printPrime() {

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        for (int i = 0; i < 100; i++) {
            if (numbers.get(i) <= 1) {
                continue;
            } else if (numbers.get(i) < 6) {
                for (int j = 2; j < 6; j++) {
                    if ((numbers.get(i) % j) != 0) {
                        primeNumbers.add(numbers.get(i));
                    }
                    break;
                }
            } else {
                for (int j = 2; j < i / 2; j++) {
                    if ((numbers.get(i) % j) != 0) {
                        primeNumbers.add(numbers.get(i));
                    }
                    break;

                }
            }
        }
        System.out.println(primeNumbers);
    }
}

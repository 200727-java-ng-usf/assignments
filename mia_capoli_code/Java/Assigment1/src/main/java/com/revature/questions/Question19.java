package com.revature.questions;

import java.util.ArrayList;

public class Question19 {

    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<Integer> noPrimeNumbers = new ArrayList<>();

    public void addOddAndEvenRemovePrime() {

        for (int i = 1; i < 11; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        int evens = 0;
        int odds = 0;
        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0) {
                evens += i;
            } else {
                odds += i;
            }
            if (i == 10) {
                System.out.println("Evens: " + evens);
                System.out.println("Odds: " + odds);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= 1) {
                continue;
            } else if (numbers.get(i) < 6) {
                for (int j = 2; j < 6; j++) {
                    if ((numbers.get(i) % j) != 0) {
                    } else {
                       noPrimeNumbers.add(numbers.get(i));
                    }
                    break;
                }
            } else {
                for (int j = 2; j < i / 2; j++) {
                    if ((numbers.get(i) % j) != 0) {

                    } else {
                        noPrimeNumbers.add(numbers.get(i));
                    }
                    break;

                }
            }
        }
        System.out.println(noPrimeNumbers);

    }

}

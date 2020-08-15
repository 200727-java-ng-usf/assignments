package com.revature.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Question19 {

    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<Integer> noPrimeNumbers = new ArrayList<>();

    public String[] addOddAndEvenRemovePrime() {
        //add numbers to the ArrayList
        for (int i = 1; i < 11; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        //get the even and odd sums
        int evens = 0;
        int odds = 0;
        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0) {
                odds += i;
            } else {
                evens += i;
            }
        }
        System.out.println("Evens: " + evens);
        System.out.println("Odds: " + odds);

        //get the primes and "remove" them from the list (add them to a new ArrayList)
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
        return new String[] {String.valueOf(evens), String.valueOf(odds), noPrimeNumbers.toString()};
    }

}

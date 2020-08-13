package com.revature.questions;

import java.util.ArrayList;

public class Question9 {

    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<Integer> primeNumbers = new ArrayList<>();

    public ArrayList<Integer> printPrime(int size) {

        for (int i = 1; i <= size; i++) {
            numbers.add(i);

        }

        for (int i = 0; i < size; i++) {
            if (numbers.get(i) == 1) {
                continue;
            } else {
                if (numbers.get(i) == 2 || numbers.get(i) == 3 || numbers.get(i) == 5 || numbers.get(i) == 7){
                    primeNumbers.add(numbers.get(i));
                    continue;
                } else if ((numbers.get(i) % 2) == 0 || (numbers.get(i) % 3) == 0 || (numbers.get(i) % 5) == 0 || (numbers.get(i) % 7 == 0)) {
                    continue;
                }
                primeNumbers.add(numbers.get(i));
            }
        }
        System.out.println(primeNumbers);
        return primeNumbers;
    }

}
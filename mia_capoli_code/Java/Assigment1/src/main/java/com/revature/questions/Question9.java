package com.revature.questions;

import java.util.ArrayList;

public class Question9 {


    //initialize ArrayLists
    ArrayList<Integer> numbers = new ArrayList<>();
    ArrayList<Integer> primeNumbers = new ArrayList<>();

    public ArrayList<Integer> printPrime(int size) {

        //create a proper-ranged ArrayList based on input.
        for (int i = 1; i <= size; i++) {
            numbers.add(i);

        }
        //for the size of the array:
        for (int i = 0; i < size; i++) {
            //if it's one, add to the list and continue
            if (numbers.get(i) == 1) {
                primeNumbers.add(numbers.get(i));
                continue;
            } else {
                //if numbers are these small numbers that are hard to compute for, add them.
                if (numbers.get(i) == 2 || numbers.get(i) == 3 || numbers.get(i) == 5 || numbers.get(i) == 7){
                    primeNumbers.add(numbers.get(i));
                    continue;
                    //if number are not evenly divisible by these numbers, the number is not prime.
                } else if ((numbers.get(i) % 2) == 0 || (numbers.get(i) % 3) == 0 || (numbers.get(i) % 5) == 0 || (numbers.get(i) % 7 == 0)) {
                    continue;
                }
                primeNumbers.add(numbers.get(i));
            }
        }
        //return prime number ArrayList
        System.out.println(primeNumbers);
        return primeNumbers;
    }

}
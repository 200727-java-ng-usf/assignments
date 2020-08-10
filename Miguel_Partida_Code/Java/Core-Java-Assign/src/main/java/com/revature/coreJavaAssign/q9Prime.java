package com.revature.coreJavaAssign;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class q9Prime {

    //this seems close to the last one except for
    // different parameters concerning which int
    //gets taken to a different arraylist
    //if a number is prime they will be taken to a different arraylist
    //prime numbers are whole numbers greater than 1,
    // that have only two factors – 1 and the number itself.
    //lets write a method that will check if an integer is prime
    public static boolean checkIfPrime (int number) {
        //this is also an edge case and also checking 1 since
        //1 is not a prime number

        if (number <= 0 || number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static ArrayList<ArrayList<Integer>> q9PrimeN (ArrayList<Integer> initialInt){
        //non-prime numbers will go in here
        ArrayList<Integer> nonPrime = new ArrayList<>();
        //primes will go in here
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        //both arrayLists will go in here
        ArrayList<ArrayList<Integer>> allNumbers = new ArrayList<>();
            allNumbers.add(nonPrime);
            allNumbers.add(primeNumbers);

        for (int i = 0; i < initialInt.size(); i++){
            int currentNumber = initialInt.get(i);

            if(checkIfPrime(currentNumber) == true){
                primeNumbers.add(currentNumber);
            }else{
                nonPrime.add(currentNumber);
            }
        }
    return allNumbers;
    }


}

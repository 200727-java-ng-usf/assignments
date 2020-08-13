package com.revature.questions;

import java.util.ArrayList;

/**
 * A <code>Q9PrimeNumber</code> creates an <code>{@link ArrayList}</code><<code>{@link Integer}</code>>
 * which stores numbers from 1 to n and prints out all the prime numbers in that <code>ArrayList</code> to the console.
 * @author stephen.brasel@gmail.com
 */
public class Q9PrimeNumber {
//    Q9. Create an ArrayList which stores numbers from 1 to 100 and
//      prints out all the prime numbers to the console.
    /**
     * An ArrayList of Integers
     */
    private ArrayList<Integer> intList = new ArrayList<>();
    /**
     * An ArrayList of prime numbers in the intList
     */
    private ArrayList<Integer> primeList = new ArrayList<>();

    /**
     * @return The ArrayList of prime numbers in the intList
     */
    public ArrayList<Integer> getPrimeList() {
        return primeList;
    }

    /**
     * Popuates an ArrayList of Integers with numbers 1-n and populates an ArrayList of Integers with the prime numbers from 1 to n.
     * @param n the number up to which the intList will be populated, as well as the number at which the prime number list will stop trying to populate.
     */
    public Q9PrimeNumber(int n) {
        for (int i = 1; i <= n; i++) {
            intList.add(i);
        }
        this.populatePrimes();
    }

    /**
     * Returns true if the given input n is a prime number
     * @param n the input to determine primality of.
     * @return true if the input n is prime.
     */
    public static boolean isPrime(int n){
        if(n <= 1) return false;                            //negatives, 0, and 1 are not prime.
        if(n <= 3) return true;                             //2 is the only even prime, 3 is the next sequential prime.
        if(n % 2 == 0 || n % 3 == 0) return false;          // implementation checking for all numbers outside of 6n (+/-) 1
        for(long i = 5; (i * i) <= n; i += 6)
            if(n%i == 0 || n % (i + 2) == 0) return false;
        return true;
    }

    /**
     * Fills the primeList with all primes from 1 to intList.size().
     */
    public void populatePrimes(){
        primeList.clear();
        for (Integer integer : intList) {
            if (isPrime(integer)) {
                primeList.add(integer);
            }
        }
    }
}

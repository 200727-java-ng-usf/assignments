package com.revature;

import java.util.ArrayList;

public class Q9Main {

    // Create ArrayList 1-100
    private static void answer() {

        // Used to turn on/off the print method
        boolean itIs = true;

        // Instantiating the ArrayList of type <Integer> named prime
        ArrayList<Integer> prime = new ArrayList<>();

        // Creating the array 1-100
        for (int i = 0; i < 100; i++) {
            prime.add(i, i + 1);
        }

        /*
            Testing each prime(i) % j == 0
            This will change itIs = false; if prime(i) % j is not a prime.
            It will change back to itIs = true when prime(i) % j is prime.
         */

        for (int i = 1; i < prime.size() - 1; i++) {
            for (int j = 2; j < prime.get(i); j++) {
                if (prime.get(i) % j == 0) {
                    itIs = false;
                    break;
                } else {
                    itIs = true;
                }
            }
            // When the loop recognizes a prime, this turns true and
            // prints out the current prime(i).
            if (itIs) {
                System.out.println(prime.get(i));
            }

        }
    }


    public static void main(String[] args) {
        answer();

    }


}

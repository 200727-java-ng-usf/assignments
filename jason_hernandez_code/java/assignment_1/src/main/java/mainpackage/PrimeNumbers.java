package mainpackage;

import java.util.ArrayList;

public class PrimeNumbers {


    // Create array
    public ArrayList<Integer> isPrime() {
        ArrayList<Integer> primes = new ArrayList<>();

        // Add each integer to the array
        for (int i = 1; i <= 100; i++) {

            // Start each one at default setting true
            boolean isPrime = true;

            // Iterate through the numbers
            for (int j = 2; j < i; j++) {

                // Check for remainders
                if (i % j == 0) {
                    // If a no-remainder division is found, number is not prime
                    isPrime = false;
                    break;
                }
                //If isPrime is true then the number is prime else not
                if (isPrime)
                    primes.add(i);
            }

        }
        System.out.println(primes);
        return primes;
    }
}

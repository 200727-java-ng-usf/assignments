package mainpackage;

import java.util.ArrayList;

public class PrimeNumbers {


    // Create array
    public void isPrime() {
        // Declare a string to hold the primes, and a placeholder int
        String listPrimes = "";
        int num = 0;

        // Iterate through 100
        for (int i = 1; i <= 100; i++) {
            // Have a counter to keep track
            int counter = 0;

            // Iterate through the numbers
            for (num = i; num >= 1; num--) {

                // Check for remainders
                if (i % num == 0) {
                    counter += 1;
                    // If a no-remainder division is found, number is not prime
                }
            }
            //Add prime number to string, followed by a space
            if (counter==2) {
                  listPrimes = listPrimes + i + " ";
            }

        }
        System.out.println("The prime numbers between 1 and 100 are:");
        System.out.println(listPrimes);

    }
}

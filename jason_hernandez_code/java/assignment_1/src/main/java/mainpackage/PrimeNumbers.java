package mainpackage;

public class PrimeNumbers {


    // Create array
    public int[] isPrime(int[] candidateNumbers) {

        // Add each integer to the array
        for (int i = 1; i <= 100; i++) {

            // Start each one at default setting true
            boolean isPrime = true;

            // Iterate through the numbers
            candidateNumbers[i] = i;
            for (int j = 2; j < i; j++) {

                // Check for remainders
                if (i % j == 0) {
                    // If a no-remainder division is found, number is not prime
                    isPrime = false;
                    break;
                }
                //If isPrime is true then the number is prime else not
                int[] primes = new int[0];
                if (isPrime)
                    primes[j] = candidateNumbers[j];

                return primes;
            }

        }
        return candidateNumbers;
    }
}

package mainpackage;

import java.util.ArrayList;

public class PrimeNumbers {
    public PrimeNumbers() {

        // Initialize two arrays
        ArrayList<Integer> numbers = new ArrayList<Integer>(100);
        ArrayList<Integer> primes = new ArrayList<Integer>(100);

        // Populate the first array with integers 1 to 100
        for (int i = 1; i <= 100; i++)
            numbers.add(i);

        // Check each number to see if it is prime
        int temp;
        boolean isPrime=true;

        for(int j=2; j<=numbers.size()/2; j++)
        {
            temp = numbers.size()%j;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
            //If isPrime is true then the number is prime else not
            if(isPrime)
                primes.add(j);

        }
        System.out.println("The Prime Numbers are " + primes);

    }
}

package mainpackage;

import java.util.ArrayList;

public class PrimeNumbers {
    public boolean isPrime(int candidateNumber) {
        if(candidateNumber < 1) return false;
        for(int i=2; i <= candidateNumber; i++) {
            candidateNumber.add(i);
        }
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

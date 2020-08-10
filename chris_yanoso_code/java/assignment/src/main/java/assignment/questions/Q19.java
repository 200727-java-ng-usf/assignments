package assignment.questions;

import java.util.ArrayList;

public class Q19 extends Q6 {
    public void oneToTenArray() {
        ArrayList<Integer> oneTen = new ArrayList<>(10);
        ArrayList<Integer> noPrime = new ArrayList<>(10);
        int evenSum = 0;
        int oddSum = 0;
        //fills array from 1-10
        for (Integer i = 1; i < 11; i++) {
            oneTen.add(i);
        }
        //checks to see if even or odd and adds them
        for (Integer i = 0; i < oneTen.size(); i++) {
            if (isEven(oneTen.get(i))) {
                evenSum += oneTen.get(i);
            } else {
                oddSum += oneTen.get(i);
            }

        }
        for (int n = 0; n < oneTen.size(); n++) {
            if(!prime(oneTen.get(n))){
                noPrime.add(oneTen.get(n));
            }

        }
        System.out.println("The sum of even numbers in 1-10 is: " + evenSum);
        System.out.println("The sum of odd numbers in 1-10 is: " + oddSum);
        System.out.println("An Array of 1-10 without prime numbers: " + noPrime);
    }

    public static boolean prime(int n){
        //1 is not prime
        if (n == 1){
            return false;
        }
        //evens are not prime
        else if (n%2 == 0){
            return false;
        }
        //divides by everything below the numbers square root to test for primes
        for (int i =2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }

        }
        //if it never gets 0 it is prime
        return true;
    }
}

package assignment.questions;

import java.util.ArrayList;

public class Q9 {

    public void primeNumbers(){
        ArrayList<Integer> primeNums = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>(100);
        //fills array from 1-100
        for(Integer i = 1; i < 101; i ++){
            nums.add(i);
        }
        //test each individual number if prime
        for (int n = 0; n < nums.size(); n++) {
            if(prime(nums.get(n))){
                primeNums.add(nums.get(n));
            }

        }

        System.out.println(primeNums);

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

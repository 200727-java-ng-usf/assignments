package assignment.questions;

import java.util.ArrayList;

public class Q9 {

    public void primeNumbers(int n){
        ArrayList<Integer> primeNums = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>(n);
        //fills array from 1-100
        for(Integer i = 1; i < n + 1; i ++){
            nums.add(i);
        }
        //test each individual number if prime
        for (int j = 0; j < nums.size(); j++) {
            if(prime(nums.get(j))){
                primeNums.add(nums.get(j));
            }

        }

        System.out.print(primeNums);

    }

    public static boolean prime(int j){
        //1 is not prime
        if (j == 1){
            return false;
        }
        //evens are not prime
        else if (j%2 == 0){
            return false;
        }
        //divides by everything below the numbers square root to test for primes
        for (int i =2; i <= Math.sqrt(j); i++){
            if (j % i == 0){
                return false;
            }

        }
        //if it never gets 0 it is prime
        return true;
    }
}

package com.revature.questions;

import java.util.ArrayList;

public class Q9PrimeNumber {
//    Q9. Create an ArrayList which stores numbers from 1 to 100 and
//      prints out all the prime numbers to the console.
    ArrayList<Integer> intList = new ArrayList<Integer>();
    ArrayList<Integer> primeList = new ArrayList<Integer>();

    public ArrayList<Integer> getPrimeList() {
        return primeList;
    }

    public Q9PrimeNumber(int n) {
        for (int i = 1; i <= n; i++) {
            intList.add(i);
        }
        this.populatePrimes();
    }

    public static boolean isPrime(int x){
        if(x <= 1) return false;
        int halflen = x/2;
        for(int i = 2; i < halflen+1; i++){
            if(x%i == 0) return false;
        }
        return true;
    }

    public void populatePrimes(){
        primeList.clear();
        for (int i = 0; i < intList.size(); i++) {
            if(isPrime(intList.get(i))){
                primeList.add(intList.get(i));
            }
        }
    }
}

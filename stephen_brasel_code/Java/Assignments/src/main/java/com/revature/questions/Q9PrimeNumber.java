package com.revature.questions;

import java.util.ArrayList;

public class Q9PrimeNumber {
//    Q9. Create an ArrayList which stores numbers from 1 to 100 and
//      prints out all the prime numbers to the console.
    ArrayList<Integer> hundred = new ArrayList<Integer>();
    ArrayList<Integer> primesToHundred = new ArrayList<Integer>();

    public ArrayList<Integer> getPrimesToHundred() {
        return primesToHundred;
    }

    public Q9PrimeNumber() {
        for (int i = 0; i < 100; i++) {
            hundred.add(i+1);
        }
    }
    public static boolean isPrime(int x){
        if(x <= 1) return false;
        int halflen = x/2;
        for(int i = 2; i < halflen+1; i++){
            if(x%i == 0) return false;
        }
        return true;
    }

    public void printPrimes(){
        primesToHundred.clear();
        boolean firstNum = true;
        for (int i = 0; i < hundred.size(); i++) {
            if(isPrime(hundred.get(i))){
                primesToHundred.add(hundred.get(i));
                if(!firstNum){
                    System.out.print(", ");
                } else{
                    firstNum = false;
                }
                System.out.print(hundred.get(i));
            }
        }
    }
}

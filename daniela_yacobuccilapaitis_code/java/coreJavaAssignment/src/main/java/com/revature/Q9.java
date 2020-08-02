package com.revature;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
    Q9. Create an ArrayList which stores numbers from 1 to 100 and prints out
    all the prime numbers to the console.
 */
public class Q9 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>(100);

        for(int i = 0; i < 100; i++){
            numbers.add(i, i+1);
        }


        for(int i = 0; i < 100; i++){
            if(isPrime(numbers.get(i))){
                System.out.print(numbers.get(i) + " ");
            }
        }
    }

    public static boolean isPrime (int num){

        for(int i = 2 ; i < num ; i++) {
            if (((double)(((double) num) / ((double) i))) == num/i) {
                return false;
            }
        }
        return true;
    }
}
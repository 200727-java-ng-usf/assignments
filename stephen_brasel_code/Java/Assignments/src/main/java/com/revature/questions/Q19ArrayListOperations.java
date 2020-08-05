package com.revature.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Q19ArrayListOperations {
//    Q19. Create an ArrayList and insert integers 1 through 10. Display the ArrayList.
//    Add all the even numbers up and display the result.
//    Add all the odd numbers up and display the result.
//    Remove the prime numbers from the ArrayList and print out the remaining ArrayList.

    ArrayList<Integer> ints = new ArrayList<>();
    Integer evens, odds;

    public Q19ArrayListOperations() {
        this(10);
    }

    public Q19ArrayListOperations(int count) {
        ints.ensureCapacity(count);
        insertNums(count);
        Init();
    }

    public Q19ArrayListOperations(ArrayList<Integer> ints) {
        this.ints = ints;
        Init();
    }

    private void insertNums(int count){
        for (int i = 0; i < count; i++) {
            ints.set(i, i);
        }
    }

    private void Init(){
        addEvens();
        addOdds();
        returnNONPrimes();
        System.out.println(ints.toString());
    }

    public void addEvens(){
        for (Integer anInt : ints) {
            if (anInt % 2 == 0) {
                evens += anInt;
            }
        }
    }
    public void addOdds(){
        for (Integer anInt : ints) {
            if (anInt % 2 == 1) {
                evens += anInt;
            }
        }
    }
    public void returnNONPrimes(){
        for (int i = 0; i < ints.size(); i++) {
            if(Q9PrimeNumber.isPrime(ints.get(i))){
                ints.remove(i--);
            }
        }
    }
}

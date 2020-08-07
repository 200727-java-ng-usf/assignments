package com.revature.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Q19ArrayListOperations {
//    Q19. Create an ArrayList and insert integers 1 through 10. Display the ArrayList.
//    Add all the even numbers up and display the result.
//    Add all the odd numbers up and display the result.
//    Remove the prime numbers from the ArrayList and print out the remaining ArrayList.

    private ArrayList<Integer> ints = new ArrayList<>();
    private Integer evens = 0, odds = 0;

    public ArrayList<Integer> getInts() {
        return ints;
    }

    public Integer getEvens() {
        return evens;
    }

    public Integer getOdds() {
        return odds;
    }

    public Q19ArrayListOperations() {
        this(10);
    }

    public Q19ArrayListOperations(int count) {
        insertNums(count);
        Init();
    }

    private void insertNums(int count){
        ints.clear();
        for (int i = 0; i < count; i++) {
            ints.add(i);
        }
    }

    private void Init(){
        addEvens();
        addOdds();
//        returnNONPrimes();
//        System.out.println(ints.toString());
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
                odds += anInt;
            }
        }
    }
    public ArrayList<Integer> returnNONPrimes(){
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 0; i < ints.size(); i++) {
            if(!Q9PrimeNumber.isPrime(ints.get(i))){
                ret.add(i);
            }
        }
        return ret;
    }
}

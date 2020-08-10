package com.revature.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Q19ArrayListOperations {
//    Q19. Create an ArrayList and insert integers 1 through 10. Display the ArrayList.
//    Add all the even numbers up and display the result.
//    Add all the odd numbers up and display the result.
//    Remove the prime numbers from the ArrayList and print out the remaining ArrayList.

    /**
     * The <code>{@link ArrayList}</code> that will be operated upon.
     */
    private ArrayList<Integer> ints = new ArrayList<>();

    /**
     * the number of {@code evens} in <code>{@link #ints}</code>
     */
    private Integer evens = 0;
    /**
     * the number of {@code odds} in <code>{@link #ints}</code>
     */
    private Integer odds = 0;

    /**
     * @return the <code>{@link ArrayList}</code> ints
     */
    public ArrayList<Integer> getInts() {
        return ints;
    }

    /**
     * @return the amount of even numbers in <code>{@link #ints}</code>
     */
    public Integer getEvens() {
        return evens;
    }

    /**
     * @return the amount of odd numbers in <code>{@link #ints}</code>
     */
    public Integer getOdds() {
        return odds;
    }

    /**
     * By default, establishes an instance of this class with an
     * <code>{@link ArrayList}</code><<code>{@link Integer}</code>>
     * of size 10.
     */
    public Q19ArrayListOperations() {
        this(10);
    }

    /**
     * establishes an instance of this class with an
     * <code>{@link ArrayList}</code><<code>{@link Integer}</code>>
     * <code>{@link #ints}</code> of size {@code count}.
     * @param count the size to establish the <code>{@link ArrayList}</code><<code>{@link Integer}</code>>
     *              <code>{@link #ints}</code>
     */
    public Q19ArrayListOperations(int count) {
        insertNums(count);
        Init();
    }

    /**
     * Inserts <code>{@link Integer}</code>s from 0 to {@code count} into the
     * <code>{@link ArrayList}</code><<code>{@link Integer}</code>> <code>{@link #ints}</code>
     * @param count the number (exclusive) up which will be stored sequentially in
     *              <code>{@link #ints}</code>, i.e.,
     *              if {@code count} is 5, <code>{@link #ints}</code> will be {0, 1, 2, 3, 4}
     */
    private void insertNums(int count){
        ints.clear();
        for (int i = 0; i < count; i++) {
            ints.add(i);
        }
    }

    /**
     * performs the <code>{@link #addEvens()}</code> and
     * <code>{@link #addOdds()}</code> operations, populating
     * <code>{@link #evens}</code> and <code>{@link #odds}</code>
     */
    private void Init(){
        addEvens();
        addOdds();
//        returnNONPrimes();
//        System.out.println(ints.toString());
    }

    /**
     * Populates <code>{@link #evens}</code> with the amount of even numbers in <code>{@link #ints}</code>
     */
    public void addEvens(){
        for (Integer anInt : ints) {
            if (anInt % 2 == 0) {
                evens += anInt;
            }
        }
    }

    /**
     * Populates <code>{@link #odds}</code> with the amount of odd numbers in <code>{@link #ints}</code>
     */
    public void addOdds(){
        for (Integer anInt : ints) {
            if (anInt % 2 == 1) {
                odds += anInt;
            }
        }
    }

    /**
     * @return a new <code>{@link ArrayList}</code><<code>{@link Integer}</code>> of all NON primes in
     *         <code>{@link #ints}</code>.
     */
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

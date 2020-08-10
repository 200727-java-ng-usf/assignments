package com.revature.questions;


import java.util.Arrays;

/**
 * A <code>Q12EnhancedFor</code> stores all the numbers from 1 to {@code n} in an array,
 * and prints out all of the even numbers in an enhanced for loop.
 * @author stephen.brasel@gmail.com
 */
public class Q12EnhancedFor {
//    Q12. Write a program to store numbers from 1 to 100 in an array.
//    Print out all the even numbers from the array.
//    Use the enhanced FOR loop for printing out the numbers.
    /**
     * An int[] for holding the digits 1 to n
     */
    private int[] arr;

    /**
     * An int[] for holding the even digits 1 to n
     */
    private int[] arrEven;

    /**
     * Returns an int[] filled with all even numbers from 1 to n.
     * By default, n is 100.
     * @return an int[] filled with all even numbers from 1 to n.
     */
    public int[] getArrEven() {
        return arrEven;
    }

    /**
     * Constructs an instance of this class with a default maximum of 100 digits placed sequentially in an
     * int[]
     */
    public Q12EnhancedFor() {
        this(100);
    }

    /**
     * Constructs an instance of this class with a maximum of n digits placed sequentially in an
     * int[]
     * @param n the maximum number of sequential digits to store in the int[]
     */
    public Q12EnhancedFor(int n){
        if(n < 0) n = 0;
        arr = new int[n];
        arrEven = new int[n/2];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            if((i+ 1) % 2 == 0){
                arrEven[i/2] = (i+ 1);
            }
        }
    }

    /**
     * Prints out all even numbers from 1 to n, n being the number this class was constructed with.
     * By default, prints all even numbers 1 to 100.
     */
    public void printEnhancedForEven(){
        boolean firstElem = true;
        for (int val : arr) {
            if(val % 2 == 0) {
                if(!firstElem){
                    System.out.print(", ");
                } else{
                    firstElem = false;
                }
                System.out.print(val);
            }
        }
    }
}

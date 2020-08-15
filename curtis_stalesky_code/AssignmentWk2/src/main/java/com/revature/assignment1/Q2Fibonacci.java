package com.revature.assignment1;

import java.util.ArrayList;
import java.util.List;

public class Q2Fibonacci {
    public static void main(String[] args) {
        // Using an ArrayList to store the numbers that will be added
        // Pre-set the ArrayList with 0 and 1 as the for loop below starts at 2
        ArrayList<Integer> fibArray = new ArrayList<Integer>();
        fibArray.add(0);
        fibArray.add(1);

        // Int variables that will hold all the values for the fib sequence to be done
        int current = 1;
        int last = 0;
        int lastlast;
        // For loop that iterates to 24 and stops
        for (int i = 2; i < 25; i++){
            lastlast = last; // lastlast is the last most variable store
            last = current; // last takes over the current variable
            current = lastlast + last; // current is the addition of the 2 previous numbers

            fibArray.add(current); // prints the most recent value
        }

        // Enhanced for loop (forEach) loop that prints out the arraylist
        for(int i : fibArray)
        System.out.println(i);
    }
}

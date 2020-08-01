package com.revature;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        // take an input that is an int
        // scan it into n
        // make it a method that can be used elsewhere

        // take an integer input from the user
        int n = 7;

        // find all numbers that descend from N
        int[] n_descending = new int[n];
        System.out.println(Arrays.toString(n_descending)); // test to see if numbers input correctly

        // store those numbers in the array
        for (int i = 0; i < n_descending.length; i++) {
            n_descending[i] = i + 1;
        }

        System.out.println(Arrays.toString(n_descending)); // test to see if numbers input correctly

        // create a variable to store the ans
        int ans = 1;

        //multiply the numbers
        for(int r = n_descending.length; r > 0; r--) {
            ans *= r;
        }
        System.out.println(ans);

    }
}

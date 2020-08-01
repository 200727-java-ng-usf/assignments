package com.revature;

public class Q1 {



    // main method
    public static void main(String[] args) {
        // establish the string to be used from the worksheet
        int someInts[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
        // create a temporary int variable to store for comparisons
        int temp;
        System.out.println("These are the bubble-sorted numbers: ");
        // use loops to compare the integers in the array
        for (int i = someInts.length - 1; i > 0; i--) {
            // parses through the integers from the end to the beginning
            for (int j = 0; j < i; j++) {
                // parses through the integers from the beginning to end
                // until they meet in the middle
                if (someInts[j] > someInts[j + 1]) {
                    // if a value at index j is greater than the one after it,
                    // then store that in a temporary location and then move
                    // that variable to the location it was replaced with.
                    temp = someInts[j];
                    someInts[j] = someInts[j + 1];
                    someInts[j + 1] = temp;
                }
            }
            System.out.print(someInts[i]);
        }
    }
}

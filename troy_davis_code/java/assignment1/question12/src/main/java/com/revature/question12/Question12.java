/*
    Q12. Write a program to store numbers from 1 to 100 in an array.
            Print out all the even numbers from the array.
            Use the enhanced FOR loop for printing out the numbers.
 */

package com.revature.question12;

import java.util.Arrays;

public class Question12 {
    //class fields to hold the array and range values
    private int[] evenOnlyArray;
    private int rangeStart;
    private int rangeEnd;
    private int[] initialArray;

    //no-args constructor to print dummy even values from 1-100
    public Question12(){
        this.rangeStart = 1;
        this.rangeEnd = 100;
        this.initialArray = new int[rangeEnd];
        initialArray = getInitialArray(rangeStart, rangeEnd);
        printThisArray(initialArray);
    }
    //parameterized constructor to store and sort the arrays based on given range values:
    public Question12(int rangeStart, int rangeEnd){
        //set the given range start
        this.rangeStart = rangeStart;
        //set the given range end
        this.rangeEnd = rangeEnd;
        //fill the initial array and store it
        this.initialArray = getInitialArray(rangeStart, rangeEnd);
        //print the array now that it has been filled
        printThisArray(initialArray);

    }
    //method to fill the initial array based on given ranges
    public int[] getInitialArray(int rangeStart, int rangeEnd){
        int[] initialArray = new int[rangeEnd+1];
        //fill the initial array based on given range values
        for (int i = rangeStart; i <= rangeEnd; i++){
            initialArray[i] = i;
        }
        return initialArray;
    }

    //method to print the array
    public void printThisArray(int[] initialArray){
        //using enhanced for loop
        for(int i : initialArray){
            if (i%2 == 0 && i != 0){ //make sure we do not print zero!
                System.out.println(i);

            }

        }

    }


}

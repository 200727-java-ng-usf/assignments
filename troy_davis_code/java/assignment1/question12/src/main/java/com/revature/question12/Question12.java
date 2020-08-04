/*
    Q12. Write a program to store numbers from 1 to 100 in an array.
            Print out all the even numbers from the array.
            Use the enhanced FOR loop for printing out the numbers.
 */

package com.revature.question12;

import java.util.Arrays;

public class Question12 {
    //class fields to hold the array and range values
    private int[] initialArray;
    private int rangeStart;
    private int rangeEnd;

    //parameterized constructor to store and sort the arrays based on given range values:
    public Question12(int rangeStart, int rangeEnd){
        //set the given range start
        this.rangeStart = rangeStart;
        //set the given range end
        this.rangeEnd = rangeEnd+1;
        //initialize the array to store the values in
        this.initialArray = new int[this.rangeEnd];
        //fill the initial array based on given range values
        for (int i = this.rangeStart; i < this.rangeEnd; i++){
            initialArray[i] = i;
        }
        //print the array now that it has been filled
        printThisArray(initialArray);
    }

    //method to print the array
    private void printThisArray(int[] initialArray){
        //using enhanced for loop
        for(int i : initialArray){
            if (i%2 == 0 && i != 0){ //make sure we do not print zero!
                System.out.println(i);
            }

        }
    }


    //Getter and setter Methods
    public int[] getInitialArray() {
        return initialArray;
    }

    public void setInitialArray(int[] initialArray) {
        this.initialArray = initialArray;
    }

    public int getRangeStart() {
        return rangeStart;
    }

    public void setRangeStart(int rangeStart) {
        this.rangeStart = rangeStart;
    }

    public int getRangeEnd() {
        return rangeEnd;
    }

    public void setRangeEnd(int rangeEnd) {
        this.rangeEnd = rangeEnd;
    }

    //Method to print the instance

    @Override
    public String toString() {
        return "Question12{" +
                "initialArray=" + Arrays.toString(initialArray) +
                ", rangeStart=" + rangeStart +
                ", rangeEnd=" + rangeEnd +
                '}';
    }
}

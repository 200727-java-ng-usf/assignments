/*
    Q12. Write a program to store numbers from 1 to 100 in an array.
            Print out all the even numbers from the array.
            Use the enhanced FOR loop for printing out the numbers.
 */

package com.revature.question12;


import java.util.Arrays;
import java.util.Objects;

public class Question12 {
    /**
     * class fields to hold the array and range values
     */
    private Integer rangeStart;
    private Integer rangeEnd;
    private int[] initialArray;

    /**
     * no-args constructor to print dummy even values from 1-100
     */
    public Question12(){

        this.rangeStart = 1;
        this.rangeEnd = 100;
        this.initialArray = new int[rangeEnd];
        initialArray = getInitialArray(rangeStart, rangeEnd);
        printThisArray(initialArray);
    }

    /**
     * parameterized constructor to store and sort the arrays based on given range values:
     * @param rangeStart
     * @param rangeEnd
     */
    public Question12(Integer rangeStart, Integer rangeEnd){
        //if the ranges are null, do nothing
        if (rangeEnd == null || rangeStart == null){
            return;
        }
        //if the ranges are zero, do nothing
        if (rangeStart == 0 || rangeEnd == 0){
            return;
        }
        //make sure range start is not less than range end
        if (rangeEnd > rangeStart){
            return;
        }
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
        this.initialArray = new int[rangeEnd];
        initialArray = getInitialArray(this.rangeStart, this.rangeEnd);
        printThisArray(initialArray);

    }

    /**
     * method to fill the initial array based on given ranges
     * @param rangeStart
     * @param rangeEnd
     * @return
     */
    private int[] getInitialArray(int rangeStart, int rangeEnd){
        int[] initialArray = new int[rangeEnd+1];
        //fill the initial array based on given range values
        for (int i = rangeStart; i <= rangeEnd; i++){
            initialArray[i] = i;
        }
        return initialArray;
    }

    /**
     * method to print the array
     * @param initialArray
     */
    private void printThisArray(int[] initialArray){
        //using enhanced for loop
        for(int i : initialArray){
            if (i%2 == 0 && i != 0){ //make sure we do not print zero!
                System.out.println(i);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question12)) return false;
        Question12 that = (Question12) o;
        return Objects.equals(rangeStart, that.rangeStart) &&
                Objects.equals(rangeEnd, that.rangeEnd) &&
                Arrays.equals(initialArray, that.initialArray);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(rangeStart, rangeEnd);
        result = 31 * result + Arrays.hashCode(initialArray);
        return result;
    }

    @Override
    public String toString() {
        return "Question12{" +
                "rangeStart=" + rangeStart +
                ", rangeEnd=" + rangeEnd +
                ", initialArray=" + Arrays.toString(initialArray) +
                '}';
    }
}

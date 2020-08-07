/*
    Q1. Perform a bubble sort on the following integer array:
        - 1,0,5,6,3,2,3,7,9,8,4
 */

package com.revature.question1;

import java.util.Arrays;

public class Question1 {
    //int-array to hold the sorted array
    private int[] sortedArray;

    public Question1(int[] givenArray){
        //default constructor. this class must be instantiated with an array which it will sort and store
        if (givenArray == null){
            this.sortedArray = givenArray;
        }else{
            this.sortedArray = sortThisArray(givenArray);
        }
    }

    //method to sort an array
    private int[] sortThisArray(int[] anArray){
        for(int i = anArray.length-1; i > 0; i--){//iterate through the array backwards
            for (int j = 0; j < i; j++){ //iterate each element and do the comparison/moving
                if (anArray[j] > anArray[j+1]) {
                    int n = anArray[j]; //store the value
                    anArray[j] = anArray[j + 1]; //move the element to the next position
                    anArray[j + 1] = n;// swap the next element to the previous element
                }
            }
        }
        //return the array
        return anArray;
    }

    //Auto-Generated getter, setter, to string, hashCode and equals:
    public int[] getSortedArray() {
        return sortedArray;
    }

    public void setSortedArray(int[] sortedArray) {
        this.sortedArray = sortedArray;
    }

    @Override
    public String toString() {
        return "Question1{" + "\n"+
                "sortedArray=" + Arrays.toString(sortedArray) + "\n"+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question1)) return false;

        Question1 question1 = (Question1) o;

        return Arrays.equals(sortedArray, question1.sortedArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(sortedArray);
    }
}

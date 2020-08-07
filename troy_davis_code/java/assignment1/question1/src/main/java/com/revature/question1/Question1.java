/*
    Q1. Perform a bubble sort on the following integer array:
        - 1,0,5,6,3,2,3,7,9,8,4
 */

package com.revature.question1;

import java.util.Arrays;

public class Question1 {
    private int[] givenArray;
    private int[] sortedArray;

    public Question1(int[] givenArray){
        this.givenArray = givenArray;
        this.sortedArray = sortThisArray(this.givenArray);
    }

    private int[] sortThisArray(int[] anArray){
        int[] tempArray = anArray;
        for(int i = tempArray.length-1; i > 0; i--){
            for (int j = 0; j < 1; j++){
                if (tempArray[j] > tempArray[j+1]) {
                    int n = tempArray[j];
                    tempArray[j] = tempArray[j + 1];
                    tempArray[j + 1] = n;
                }
            }
        }

        return tempArray;
    }

    public int[] getGivenArray() {
        return givenArray;
    }

    public void setGivenArray(int[] givenArray) {
        this.givenArray = givenArray;
    }

    public int[] getSortedArray() {
        return sortedArray;
    }

    public void setSortedArray(int[] sortedArray) {
        this.sortedArray = sortedArray;
    }

    @Override
    public String toString() {
        return "Question1{" + "\n"+
                "givenArray=" + Arrays.toString(givenArray) + "\n"+
                "sortedArray=" + Arrays.toString(sortedArray) + "\n"+
                '}';
    }
}

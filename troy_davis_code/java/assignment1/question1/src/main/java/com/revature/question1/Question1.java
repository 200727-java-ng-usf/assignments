/*
    Q1. Perform a bubble sort on the following integer array:
        - 1,0,5,6,3,2,3,7,9,8,4
 */
package com.revature.question1;
import java.util.Arrays;

public class Question1 {
    //create class fields for the given and sorted arrays
    private int[] givenArray;
    private int[] sortedArray;

    public Question1(int[] givenArray){
        //make a copy of the initial array
        this.givenArray = Arrays.copyOf(givenArray, givenArray.length);
        //auto-sort the array on instantiation of the question object
        this.sortedArray = sortThisArray(this.givenArray);
    }

    private int[] sortThisArray(int[] anArray){
        //check for null value
        if (anArray == null){
            return new int[]{};
        } else if(anArray.length <= 1){
            //check for an array of less than 1 in length(no need to sort)
            return anArray;
        }
        int[] tempArray = Arrays.copyOf(anArray, anArray.length);
        //iterate each number through the array
        for(int i = tempArray.length-1; i > 0; i--){
            //bubble each number through the array
            for (int j = 0; j < i; j++){
                //compare this number to the next number
                if (tempArray[j] > tempArray[j+1]) {
                    //initialize  new temp. number set to current number
                    int n = tempArray[j];
                    //the current number = the next number
                    tempArray[j] = tempArray[j + 1];
                    //the next number equals the current number
                    tempArray[j + 1] = n;
                }
            }
        }
        //return the array
        return tempArray;
    }

    //auto-generated getters and setters:
    public int[] getGivenArray() {
        return givenArray;
    }

    public void setGivenArray(int[] givenArray) {
        //object can be passed new arrays to be sorted after instantiation
        //these arrays will be auto sorted
        this.givenArray = givenArray;
        this.sortedArray = sortThisArray(this.givenArray);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question1)) return false;
        Question1 question1 = (Question1) o;
        return Arrays.equals(getGivenArray(), question1.getGivenArray()) &&
                Arrays.equals(getSortedArray(), question1.getSortedArray());
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(getGivenArray());
        result = 31 * result + Arrays.hashCode(getSortedArray());
        return result;
    }
}

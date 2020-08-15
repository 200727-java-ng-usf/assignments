/**
 * Q9. Create an ArrayList which stores numbers from 1 to 100
 *      and prints out all the prime numbers to the console.
 */
package com.revature.question9;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.IntStream;

public class Question9 {
    private ArrayList<Integer> storageArray;

    //no args constructor to auto print based on default values
    public Question9(){
        //fill storage array based on default values and store it to the class instance
        storageArray = fillThisArrayList(1,100);
        //print prime only numbers from the arrayList
        printPrimeNumbersFromArraylist(storageArray);
    }
    public Question9(Integer start, Integer end){
        //sanity check the start and end ranges
        if(start == null || end == null || start > end){
            //do nothing
            storageArray = new ArrayList<>();
        } else {
            storageArray = fillThisArrayList(start, end);
            printPrimeNumbersFromArraylist(storageArray);
        }
    }

    //method to print the prime numbers
    private void printPrimeNumbersFromArraylist(ArrayList<Integer> arrayList){
        //check for null values first
        if (arrayList != null){
            //iterate through the arrayList
            for (Integer i : arrayList){
                //only print prime numbers using Intstream, Math, and noneMatch in a one line lambda
                if (IntStream.rangeClosed(2, (int) Math.sqrt(i))
                        .noneMatch(n -> (i % n == 0))){
                    System.out.println(i);
                }
            }
        }
    }

    private ArrayList<Integer> fillThisArrayList(Integer start, Integer end){
        //create temporary array
        ArrayList<Integer> tempArrayList = new ArrayList<>();
        //iterate through integers from start value to end value
        for (int i = start; i < end; i++){
            tempArrayList.add(i);
        }
        return tempArrayList;
    }


    public ArrayList<Integer> getStorageArray() {
        return storageArray;
    }

    public void setStorageArray(ArrayList<Integer> storageArray) {
        this.storageArray = storageArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question9)) return false;
        Question9 question9 = (Question9) o;
        return Objects.equals(getStorageArray(), question9.getStorageArray());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStorageArray());
    }

    @Override
    public String toString() {
        return "Question9{" +
                "storageArray=" + storageArray +
                '}';
    }
}

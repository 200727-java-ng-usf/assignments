package com.revature.questions;

// Q1. Perform a bubble sort on the following integer array:  1,0,5,6,3,2,3,7,9,8,4
public class Q1 {

    public static void main(String[] args) {

        Q1 obj = new Q1();

        int[] intArray = {1,0,5,6,3,2,3,7,9,8,4};

        intArray = obj.bubbleSortArray(intArray);

        System.out.print(arrayToString(intArray));
    }

    public int[] bubbleSortArray(int [] intArray) {
        for(int sortedCounter = 0; sortedCounter<intArray.length; sortedCounter++) {

            int temp = 0;
            for (int j = 0; j < intArray.length - 1 - sortedCounter; j++) {
                if(intArray[j] > intArray[j+1]){
                    temp = intArray[j+1];
                    intArray[j+1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray;
    }

    private static String arrayToString(int arrayFib[]){

        String string = "";
        for(int i = 0; i < arrayFib.length; i++){
            string = string + " " + arrayFib[i];
        }

        return string;

    }//arrayToString

}

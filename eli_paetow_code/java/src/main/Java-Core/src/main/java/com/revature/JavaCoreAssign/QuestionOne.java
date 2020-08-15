package com.revature.JavaCoreAssign;


import java.util.Arrays;

// Perform a bubble sort on the following integer array:  1,0,5,6,3,2,3,7,9,8,4
public class QuestionOne {

    public int[] bubbleSortQ1 (int[] arr){

        /**
         *if the array is empty or = o. return new int array
         * */

        if (arr == null || arr.length ==0){
            return new int[0];
        }

        /**
         *create copy of array to use
         * */
        int[] arrayCopy = Arrays.copyOf(arr, arr.length);

        for (int i =0; i<arrayCopy.length; i++){

            /**
             * while the first loop is running, start the second loop to
             * start the actual sorting
             * */

            for (int j=0; j< arrayCopy.length -i && arrayCopy[j] != arrayCopy[arrayCopy.length -1]; j++){


                /**
                 *actual math behind the sorting
                 * */
                if (arrayCopy[j] > arrayCopy[j+1]){
                    int x = arrayCopy[j];
                    arrayCopy[j] = arrayCopy[j +1];
                    arrayCopy[j+1] = x;
                }
            }
        }

        return arrayCopy;


    }
}

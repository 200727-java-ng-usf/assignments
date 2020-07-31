package com.revature;

import static com.revature.q1bubbleSort.bubbleSort;
import static com.revature.q2Fibonacci.*;

public class AppDriver {
    public static void main(String[] args){

        System.out.println("This is the bubble sort");
        //this is the array
        int[] arr ={1,0,5,6,3,2,3,7,9,8,4};
        //this is the array before the bubble sort
        for(int i = 0;i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("+--------------+");
        //this here will bubble sort the numbers
        bubbleSort(arr);

        for(int i = 0; i< arr.length; i++ ){
            System.out.println(arr[i] + " ");
        }
        System.out.println("+--------------+");
        System.out.println("This is the first 25 Fibonacci Numbers ");

        int FibonacciNumber = 25;//This is the number of times that the Fibonacci number will incriment

        FibonacciN(FibonacciNumber);

    }
}

package com.revature;

import static com.revature.q1bubbleSort.bubbleSort;
import static com.revature.q2Fibonacci.*;
import static com.revature.q3Reverse.reverseString;
import static com.revature.q4NFactorial.*;

public class AppDriver {

    public static void main(String[] args){

        System.out.println("This is the bubble sort");
        //this is the array
        int[] arr ={1,0,5,6,3,2,3,7,9,8,4};
        //this is the array before the bubble sort
        for (int j : arr) {
            System.out.println(j + " ");
        }
        System.out.println("+--------------+");
        //this here will bubble sort the numbers
        bubbleSort(arr);

        for (int j : arr) {
            System.out.println(j + " ");
        }
        System.out.println("+--------------+");
        System.out.println("This is the first 25 Fibonacci Numbers ");

        int FibonacciNumber = 25;//This is the number of times that the Fibonacci number will incriment

        FibonacciN(FibonacciNumber);
        
        System.out.println("+--------------+");

        //This is the string that will be reversed
        String reverseString = "ReverseString";

        reverseString(reverseString);

        System.out.println("+--------------+");

        // Here we will throw a previously used FibonacciNumber to example the factorial method
        factorial(FibonacciNumber);

        System.out.println("Factorial of " + FibonacciNumber + " is " + factorial(FibonacciNumber));

        System.out.println("+--------------+");


    }


}

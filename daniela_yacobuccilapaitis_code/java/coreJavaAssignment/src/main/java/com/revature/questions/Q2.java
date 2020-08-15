package com.revature.questions;

import java.util.Arrays;

// Q2. Write a program to display the first 25 Fibonacci numbers beginning at 0.
public class Q2 {


    public static void main(String[] args) {

        Q2 obj = new Q2();
        int amountOfFib = 25;
        System.out.println(arrayToString(obj.fibonacciList(amountOfFib)));

    }//main

    public static int fibonacciNum (int num) {

        if (num==0) {
            return 0;
        }
        else
        if (num==1||num==2) {
            return 1;
        }
        else
            return fibonacciNum(num-1) + fibonacciNum(num-2);
    }// fibonacciNum

    public int[] fibonacciList (int lengthOfArray) {

        int[] fibNums = new int [lengthOfArray];

        for(int i = 0; i < lengthOfArray; i++) {
            fibNums[i] = fibonacciNum(i);
        }
        return fibNums;

    }//fibonacciList

    public static String arrayToString(int arrayFib[]){

        String string = "";
        for(int i = 0; i < arrayFib.length; i++){
            string = string + " " + arrayFib[i];
        }

        return string;

    }//arrayToString

    
}//Class Q2

package com.revature;

import static com.revature.AppDriver.defaults;

public class Q12 {

    //Write a program to store numbers from 1 to 100 in an array.
    //Print out all the even numbers from the array.
    //Use the enhanced FOR loop for printing out the numbers.

    //for loop using i to element
    //modulous for checking evens
    //


    public Q12(){
        int[] hunArr = new int[100];
        if(!defaults){
            System.out.println("Requires array size.");
            InputHandler input = InputHandler.getInstance();
            int size = input.intInput();
            int[] customArr = new int[size];
            hundredArr(customArr);
        } else {
            hundredArr(hunArr);
        }

    }

    private void hundredArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }

        for (int element : arr){
            if(element % 2 == 0){
                System.out.print(element + " ");
            }
        }
    }



}

package com.revature;

public class Q12 {

    //Write a program to store numbers from 1 to 100 in an array.
    //Print out all the even numbers from the array.
    //Use the enhanced FOR loop for printing out the numbers.

    //for loop using i to element
    //modulous for checking evens
    //
    public int[] hunArr = new int[100];

    private void hundredArr(){
        for(int i = 0; i < hunArr.length; i++){
            this.hunArr[i] = i+1;
        }

        for (int element : this.hunArr){
            if(element % 2 == 0){
                System.out.print(element + " ");
            }


        }

    }



    public Q12(){
        super();
        hundredArr();
    }


}

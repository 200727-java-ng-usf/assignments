package com.revature;


/*
    Q12. Write a program to store numbers from 1 to 100 in an array.
    Print out all the even numbers from the array.
    Use the enhanced FOR loop for printing out the numbers.
 */
public class Q12 {

    public static void main(String[] args) {
        int[] numbers = new int[100];

        for(int i = 0; i < numbers.length ; i++){
            numbers[i] = i + 1;
        }

        for(int element:numbers){
            if (element % 2 == 0)
                System.out.print(element + " ");
        }
    }
}

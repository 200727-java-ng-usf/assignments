package com.revature;

public class q6EvenNumber {
    static void isItEven(int number){
        //divide the number by 2
        //if its even or odd it will equal an int
        //equal numbers will not have a remainder
        //
        int halfNumber = number / 2;

        //multiplying the halfNumber will make even numbers
        //go back to its original state
        //odd numbers will be given a number that is not its original
        int otherNumber = halfNumber* 2;

        if (number == otherNumber){
            System.out.println(number + " is an even Number");
        }else {
            System.out.println(number + " is an odd Number");
        }

    }
}

package com.revature;

import static com.revature.AppDriver.defaults;

public class Q6 {
    //Write a program to determine if an integer is even without using the modulus operator (%)

    public Q6(){
        int x;
        if(!defaults){
            System.out.println("Requires integer x to determine if even.");
            InputHandler input = InputHandler.getInstance();
            x = input.intInput();
        } else {
            x = 7;
        }
        System.out.println("Even? " + evenOrNot(x));
    }

    public static boolean evenOrNot(int num){ //ex 5
        double check;
        boolean isEven;
        check = num/2; //ex 2.0 = 5/2
        if(check+check < num){ //ex 2.0*2 = 4 < 5
            isEven = false;
        } else {
            isEven = true;
        }
        return isEven;
        //the idea here is that by dividing ints without using modulus, we lose the remainder
        //it just vanishes off into the cosmic void, like a real shakespearean tragedy
        //so by adding the resulting 'halves' back together, we should end up with less than the original
        //even numbers should divide evenly and cleanly
        //odd numbers don't
    }

}

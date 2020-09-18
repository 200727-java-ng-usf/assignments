package com.revature;

import static com.revature.AppDriver.defaults;

public class Q15 implements Q15Interface {

    //Write a program that defines an interface having the following methods:
    // addition, subtraction, multiplication, and division.
    // Create a class that implements this interface and provides
    // appropriate functionality to carry out the required operations.
    // Hard code two operands in a test class having a main method
    // that calls the implementing class.

    public Q15(){
        int x;
        int y;
        if(!defaults){
            InputHandler input = InputHandler.getInstance();
            System.out.println("Requires non-zero int x and int y.");
            x = input.intInput();
            y = input.intInput();
        } else {
            x = 5;
            y = 10;
        }
        System.out.println(add(x,y));
        System.out.println(sub(x,y));
        System.out.println(div(x,y));
        System.out.println(mult(x,y));
    }

    public double add(double x, double y) {
        return x+y;
    }

    public double sub(double x, double y) {
        return x-y;
    }

    public double mult(double x, double y) {
        return x*y;
    }

    public double div(double x, double y) {
        return x/y;
    }

}

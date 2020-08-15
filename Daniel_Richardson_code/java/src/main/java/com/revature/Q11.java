package com.revature;
import com.revature.misc.Q11Misc; //importing the class

import static com.revature.AppDriver.defaults;

public class Q11 {
    //Write a program that would access two float-variables from
    // a class that exists in another package.
    // Note, you will need to create two packages to demonstrate the solution.

    private float num1;
    private float num2;

    public Q11(){
        pckgAccessor();
        System.out.println(num1);
        System.out.println(num2);
    }

    public void pckgAccessor(){
        Q11Misc misc = new Q11Misc();

        if(!defaults){
            InputHandler input = InputHandler.getInstance();
            System.out.println("Requires two float values.");
            misc.setNum1(input.floatInput());
            misc.setNum2(input.floatInput());
        } //no else statement. we're grabbing the vars regardless
        num1 = misc.getNum1();
        num2 = misc.getNum2();
    }


}

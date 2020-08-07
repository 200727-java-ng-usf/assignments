package com.revature;
import com.revature.misc.Q11Misc; //importing the class

public class Q11 {
    //Write a program that would access two float-variables from
    // a class that exists in another package.
    // Note, you will need to create two packages to demonstrate the solution.

    public static float pckgAccessor(){

        Q11Misc pckgOb = new Q11Misc();
        float num1 = pckgOb.num1;
        float num2 = pckgOb.num2;
        //feeling cute today so I'll add them together
        float num3 = num1+num2;
        return num3;
    }


}

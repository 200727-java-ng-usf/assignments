package com.revature.coreJavaAssign;

import java.util.ArrayList;
import java.util.Scanner;

public class q17intrest {
    public static Double q17interest() {
        //These are the values that will be calculated
        double totalInterest;
        double rateOfInterest ;
        double principal;
        double numberOfYears;

        //this will take in the users inputs
        Scanner calculateIntreset = new Scanner(System.in);

            System.out.println("Enter principal: ");
            principal = Double.parseDouble(calculateIntreset.next());
            //the break will exit the try statement when the right input is given


        //I used to have a while loop in between ever System.in but had trouble testing
        //so i removed that

//        Scanner rateOfInterestInput = new Scanner(System.in);

                System.out.println("Enter Rate of Interest: ");
                rateOfInterest = Double.parseDouble(calculateIntreset.next());
                //the break will exit the try statement when the right input is given



//        Scanner numberOfYearsInput = new Scanner(System.in);

                System.out.println("Enter Number of Years: ");
                numberOfYears = Double.parseDouble(calculateIntreset.next());



        //this will get the total intrest
        totalInterest = rateOfInterest * principal * numberOfYears;


        System.out.println( rateOfInterest + " * "
                 + principal +  " * " + numberOfYears +
               " = " + totalInterest);



        return totalInterest;
    }
}

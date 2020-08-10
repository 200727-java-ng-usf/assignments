package com.revature.coreJavaAssign;

import java.util.ArrayList;
import java.util.Scanner;

public class q17intrest {
    public static Double q17interest() {
        //These are the values that will be calculated
        double rateOfInterest;
        double principal;
        double numberOfYears;
        double totalInterest;



        //this will take in the users inputs
        Scanner principalInput = new Scanner(System.in);
        //this while block will happen with all three of the refrences
        while (true){
            //the while loop will keep the try statement looping until that break statement is hit
        try{
            System.out.println("Enter principal: ");
            principal = Double.parseDouble(principalInput.next());
            //the break will exit the try statement when the right input is given
            break;
        }catch(Exception e){
            System.out.println("Wrong input,please try again...");
        }
        }

        Scanner rateOfInterestInput = new Scanner(System.in);
        while (true){
            try{
                System.out.println("Enter Rate of Interest: ");
                rateOfInterest = Double.parseDouble(rateOfInterestInput.next());
                //the break will exit the try statement when the right input is given
                break;
            }catch(Exception e){
                System.out.println("Wrong input,please try again...");
            }
        }


        Scanner numberOfYearsInput = new Scanner(System.in);
        while (true){
            try{
                System.out.println("Enter Number of Years: ");
                numberOfYears = Double.parseDouble(numberOfYearsInput.next());
                //the break will exit the try statement when the right input is given
                break;
            }catch(Exception e){
                System.out.println("Wrong input,please try again...");
            }
        }

        //this will get the total intrest
        totalInterest = rateOfInterest * principal * numberOfYears;


        System.out.println( rateOfInterest + " * "
                 + principal +  " * " + numberOfYears +
               " = " + totalInterest);



        return totalInterest;
    }
}

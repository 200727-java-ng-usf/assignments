package com.revature.questions;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Question17 {
    public double simpleInterest() {
        try {
            //retreive the values to calculate the intrest from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the principal: ");
            String principalS = scanner.next();
            double principal = parseDouble(principalS);
            System.out.print("Please enter the rate: ");
            String rateS = scanner.next();
            double rate = parseDouble(rateS);
            System.out.print("Please enter the time: ");
            String timeS = scanner.next();
            double time = parseDouble(timeS);
            //edge cases
            if (time < 1) {
                System.out.println("That's not how time works....");
                return 0;
            } else if (principal < 1 || rate < 1){
                System.out.println("That's not how money works....");
                return 0;
            }
            //print interest
            System.out.println("Your interest is: " + principal * rate * time);
            return principal * rate * time;
        }
        //catch exceptions
        catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Invalid value!");
        }
        //default return
        return 0.0;
    }
}

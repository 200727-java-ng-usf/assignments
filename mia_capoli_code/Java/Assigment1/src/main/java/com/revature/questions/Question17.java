package com.revature.questions;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Question17 {
    public void simpleInterest() {
        try {
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
            System.out.println("Your interest is: " + principal * rate * time);
        }
        catch (InputMismatchException e) {
            e.printStackTrace(); // good idea to print the stack trace in development for logging purposes
            System.out.println("Invalid value!"); // prints if the user gives bad data
        }
    }
}

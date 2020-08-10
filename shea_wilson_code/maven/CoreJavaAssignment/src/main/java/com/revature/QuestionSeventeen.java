package com.revature;

import java.util.Scanner;

public class QuestionSeventeen {

    private static double simpleInterest(long p, float r , int t){ //method to return the the interest rate

        // initializing fields with parameters of the method
        int time = t;
        float rate = r;
        long prin = p;

        double interest = prin * rate * time ; // initialize interest with product

        return interest;
    }

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        // Request user input
        System.out.print("Please enter the principle: ");
        // Accept user input
        long userLong = user.nextLong();
        System.out.print("Please enter the rate (Please use decimal value to represent percentage): ");
        float userFloat = user.nextFloat();
        System.out.print("Please the time in years: ");
        int userInt = user.nextInt();

        // method call to find the product of user input
        double totalInterest = simpleInterest(userLong,userFloat,userInt);
        System.out.println("+---------------------------------+");
        System.out.printf("Thank you for your input! \n"
                                +"Your interest rate is: %.2f",totalInterest);

    }
}

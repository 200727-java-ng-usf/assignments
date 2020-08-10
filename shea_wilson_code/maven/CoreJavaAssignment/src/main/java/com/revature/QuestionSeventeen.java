package com.revature;

import java.util.Scanner;

public class QuestionSeventeen {

    private static double simpleInterest(long p, float r , int t){

        int time = t;
        float rate = r;
        long prin = p;

        double interest = prin * rate * time ;

        return interest;
    }

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Please enter the principle: ");
        long userLong = user.nextLong();
        System.out.print("Please enter the rate (Please use decimal value to represent percentage): ");
        float userFloat = user.nextFloat();
        System.out.print("Please the time in years: ");
        int userInt = user.nextInt();

        double totalInterest = simpleInterest(userLong,userFloat,userInt);
        System.out.println("+---------------------------------+");
        System.out.printf("Thank you for your input! \n"
                                +"Your interest rate is: %.2f",totalInterest);

    }
}

package com.revature;

import java.util.Scanner;

public class Q17{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double simpleInterest;

        System.out.print("Enter principal: ");
        simpleInterest = scan.nextDouble();

        System.out.print("Enter rate of interest: ");
        simpleInterest *= scan.nextDouble();

        System.out.print("Enter number of years: ");
        simpleInterest *= scan.nextDouble();

        System.out.println("The simple interest is " + simpleInterest);

        scan.close();
    }
}
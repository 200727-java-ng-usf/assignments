package com.revature;

import java.util.Scanner;

public class Question17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your principal, rate of interest, and years");

        double principal = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();

        double interest = principal * rate * time;

        System.out.println(interest);
    }
}

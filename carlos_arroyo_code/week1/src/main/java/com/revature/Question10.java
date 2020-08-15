package com.revature;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

        int num1;
        int num2;
        int result;



        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = scn.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = scn.nextInt();
        scn.close();

//        result = Math.min(num1, num2);
        result = num1 < num2 ? num1:num2;
        System.out.println("Smallest number is " + result);
    }
}


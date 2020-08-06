package com.revature;

import java.util.Scanner;

public class Q10Main {


    private static void answer(int num1, int num2) {

        if (num1 == num2) {
            System.out.println("The numbers are the same.");
        } else {
            System.out.println((num1 < num2) ? "The minimum number is " + num1 : "The minimum number is " +num2);
        }



    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = input.nextInt();
        System.out.println("Enter the second number");
        int num2 = input.nextInt();

        input.close();

        answer(num1, num2);
    }


}

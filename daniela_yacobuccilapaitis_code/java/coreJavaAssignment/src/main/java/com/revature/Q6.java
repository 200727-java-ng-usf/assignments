package com.revature;
import java.sql.SQLOutput;
import java.util.Scanner;

//Q6. Write a program to determine if an integer is even without using the modulus operator (%)
public class Q6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer ");
        int num = scan.nextInt();
        isEven(num);

    }

    private static void isEven(int num) {
        if (num/2 == (double)num/2.0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");

    }
}

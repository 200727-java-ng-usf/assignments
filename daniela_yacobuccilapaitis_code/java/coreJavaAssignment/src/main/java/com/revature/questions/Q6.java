package com.revature.questions;
import java.sql.SQLOutput;
import java.util.Scanner;

//Q6. Write a program to determine if an integer is even without using the modulus operator (%)
public class Q6 {

    public static void main(String[] args) {
        Q6 obj = new Q6();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer ");
        int num = scan.nextInt();
        obj.isEven(num);

    }

    public boolean isEven(int num) {
        if (num/2 == (double)num/2.0) {
            System.out.println("The number is even");
            return true; }
        else {
            System.out.println("The number is odd");
            return false; }

    }
}

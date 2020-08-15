package com.revature.questions;


import java.sql.SQLOutput;
import java.util.Scanner;

//Q10. Find the minimum of two numbers using ternary operators.
public class Q10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1!=num2)
            System.out.println(num1<num2 ? "The first number is the minimum":"The second number is the minimum");
        else
            System.out.println("Can't find minimum, they are both the same number");

    }
}

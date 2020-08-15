package com.revature.questions;

import java.util.Scanner;

//  Q4. Write a program to compute N factorial.
public class Q4 {

    public static void main(String[] args) {

        Q4 obj = new Q4();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = (int)scan.nextInt();
        System.out.println(num + "! =" + obj.calcFactorial(num));
    }

    public int calcFactorial(int num) {
        if (num == 0||num == 1)
            return 1;
        else
        return (num * calcFactorial(num-1));
    }




}

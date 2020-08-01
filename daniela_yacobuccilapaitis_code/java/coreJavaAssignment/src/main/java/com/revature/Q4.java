package com.revature;

import java.util.Scanner;

//  Q4. Write a program to compute N factorial.
public class Q4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = (int)scan.nextInt();
        System.out.println(num + "! =" + calcFactorial(num));
    }

    public static int calcFactorial(int num) {
        if (num == 0||num == 1)
            return 1;
        else
        return (num * calcFactorial(num-1));
    }




}

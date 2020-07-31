package com.revature;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Arrays;

public class Q14{

    public static void switchDemo(int var){

        switch(var){

            case 1:
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a number: ");
                int num = scan.nextInt();
                System.out.println("The square root of " + num + " is " + Math.sqrt(num));
                break;
            
            case 2:
                LocalDate date = LocalDate.now();
                System.out.println("Today is " + date.toString());
                break;
            
            case 3:
                String str = "I am learning Core Java";
                String[] strArr = str.split(" ");
                System.out.println(Arrays.toString(strArr));
                break;
        }
    }

    public static void main(String[] args){

        switchDemo(1);
        switchDemo(2);
        switchDemo(3);
    }
}
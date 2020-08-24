package com.revature;

//import java.time.LocalDate;
//import java.util.Date;
//import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
//java.util.Date date=new java.util.Date();

public class Q14 {

    static double x;
    static String substring = "I am learning Core Java";
    static String date;
    static String[] st;
    static Scanner sc;
     public void switchCaseChoices1To3(int n) {
        // Declare the object and initialize with
        // predefined standard input object
        sc = new Scanner(System.in);
        String msg = "Choose from 1 to 3 or 99 to exit:\n";
        System.out.println(msg + "initial msg");
            switch (n) {
                case 1:
                    x = Math.sqrt(9);
                    System.out.println(x);
                    break;
                case 2:
                    date = new Date().toString();
                    System.out.println(date);
                    break;
                case 3:
                    st = substring.split(" ");
                    for (String a : st) {
                        System.out.println(a);
                    }
                    break;
                default:
                    if (n ==99)
                        break;
                    else
                       System.out.println(msg+"last");
            }

        }

    public static void main(String[] args) {
        Q14 q14 = new Q14();
         int n = 1; // n=2; n=3
        q14.switchCaseChoices1To3(n);
    }
}

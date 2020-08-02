package com.revature;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q14 {


    public void menu(){
        System.out.println("----------  Menu  -----------");
        System.out.println("1) Find the Square root of a number.");
        System.out.println("2) Today;s date");
        System.out.println("3) Split String");
        System.out.println("4) Exit --");
        System.out.println(" ");
        System.out.println("Please Enter your option ：");
    }

    public double SquareRoot(double a){
        return Math.sqrt(a);
    }

    public void today() {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.println("Today's date : " + ft.format(dNow));
    }
    public void StringSplit() {
        String str = "I am learning Core Java";

        String[] spString = str.split("\\s+");
        for (String ss : spString) {
            System.out.println(ss);


        }
    }


}

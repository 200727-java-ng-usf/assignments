package com.revature.coreJavaAssign;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class q14Cases {

//    public static void main(String[] args) {
//        q14Cases();
//    }

    static boolean q14Cases(int casePick){
        Scanner scanner = new Scanner(System.in);
        boolean pass = false;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss") ;
        Date todaydate = new Date();
        //this is the edge casing

        if (casePick>=3||casePick<=0){
            return false;
        }

        switch (casePick){
            case 1:
                System.out.println("What would you liked square-rooted: ");
                String squareRoot = scanner.next();
                System.out.println(Math.sqrt(Double.parseDouble(squareRoot)));
            case 2:
                System.out.println("Here is the date: " + dateFormat.format(todaydate));
            case 3:
                String case3String = "I am learning Core Java";
                String[] individualWords = case3String.split("");
                for(String i :individualWords){
                    System.out.print(i);
                }
                pass = true;
                break;
        }
        return pass;
    }
}

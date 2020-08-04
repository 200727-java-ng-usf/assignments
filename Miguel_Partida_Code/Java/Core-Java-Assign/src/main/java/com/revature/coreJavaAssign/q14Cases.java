package com.revature.coreJavaAssign;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class q14Cases {

    public static void main(String[] args) {
        cases();
    }

    static void cases(){
        Scanner scanner = new Scanner(System.in);
        int casePick = 1;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss") ;
        Date todaydate = new Date();

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
                break;
        }
    }
}

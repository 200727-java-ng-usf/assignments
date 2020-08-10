/*
    Q14. Write a program that demonstrates the switch case. Implement the following functionalities in the cases:java
        Case 1: Find the square root of a number using the Math class method.
        Case 2: Display today’s date.
        Case 3: Split the following string and store it in a string array.
           	“I am learning Core Java”
 */
package com.revature.question14;


import java.io.Console;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Question14 {
    private int caseNUmber;
    Console console = System.console();
    double caseOne;
    String todaysDate;
    String[] splitStringArray;

    public Question14(){
        //start from console
        System.out.println("please enter a case number from 1 to 3: ");
        try {
            caseNUmber = Integer.parseInt(console.readLine());
            switch (caseNUmber){
                case 1:{
                    System.out.println("please enter a number to find the square root of: ");
                    int someThingToTest = Integer.parseInt(console.readLine());
                    caseOne = findSquareRoot(someThingToTest);
                    System.out.println("The square root is: " + caseOne);

                }
                case 2:{
                    todaysDate = getTodaysDate();
                    System.out.println("Today's date is: " + todaysDate);
                }
                case 3:{
                    System.out.println("Please enter string to store in array");
                    String toSplit = console.readLine();
                    splitStringArray = splitThisString(toSplit);
                    System.out.println("the split string is: " + splitStringArray);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("something went wrong ");
        }

    }

    public double findSquareRoot(double findThis){
        double i = 0.00d;
        i = Math.sqrt(findThis);
        return i;
    }
    public String getTodaysDate(){
        String returnString = "";
        DateFormat date = new SimpleDateFormat("dd/MM/yy");
        Date dateObject = new Date();
        returnString = date.format(dateObject);
        return returnString;
    }
    public String[] splitThisString(String splitTHis){
        String[] returnString = splitTHis.split(",");
        return returnString;
    }

}

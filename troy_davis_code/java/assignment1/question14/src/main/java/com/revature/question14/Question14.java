/*
    Q14. Write a program that demonstrates the switch case. Implement the following functionalities in the cases:java
        Case 1: Find the square root of a number using the Math class method.
        Case 2: Display today’s date.
        Case 3: Split the following string and store it in a string array.
           	“I am learning Core Java”
 */
package com.revature.question14;

import com.sun.istack.internal.localization.NullLocalizable;

import java.io.Console;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Question14<Type> {
    private int caseNUmber;
    private Type thingToReturn;

    public Question14(int someCaseNumber){
        this.caseNUmber = someCaseNumber;
        //this.thingToReturn = performSwitch(caseNUmber);
    }
    public Question14(int someCaseNumber, int someThingToTest){
        this.thingToReturn = performSwitch(caseNUmber, someThingToTest);
    }

    private Type performSwitch(int someCaseNumber, int someThingToTest){
        Type returnMe = null;
        Console console = System.console();
        switch (someCaseNumber){
            case 1:{
                double caseOne = findSquareRoot(someThingToTest);
                returnMe.equals(caseOne);
            }
            case 2:{
                String todaysDate = getTodaysDate();
                returnMe.equals(todaysDate);
            }
            case 3:{
                System.out.println("Please enter string to store in array");
                String toSplit = console.readLine();
                String[] splitStringArray = splitThisString(toSplit);
                returnMe.equals(splitStringArray);
            }
        }

        return returnMe;
    }
    private double findSquareRoot(double findThis){
        double i = 0.00d;
        i = Math.sqrt(findThis);
        return i;
    }
    private String getTodaysDate(){
        String returnString = "";
        DateFormat date = new SimpleDateFormat("dd/MM/yy");
        Date dateObject = new Date();
        returnString = date.format(dateObject);
        return returnString;
    }
    private String[] splitThisString(String splitTHis){
        String[] returnString = splitTHis.split(",");
        return returnString;
    }

    public int getCaseNUmber() {
        return caseNUmber;
    }

    public void setCaseNUmber(int caseNUmber) {
        this.caseNUmber = caseNUmber;
    }

    public Type getThingToReturn() {
        return thingToReturn;
    }

    public void setThingToReturn(Type thingToReturn) {
        this.thingToReturn = thingToReturn;
    }

    @Override
    public String toString() {
        return "Question14{" +
                "caseNUmber=" + caseNUmber +
                ", thingToReturn=" + thingToReturn +
                '}';
    }
}

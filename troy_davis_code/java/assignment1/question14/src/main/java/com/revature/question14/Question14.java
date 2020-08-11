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
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Question14 {
    private int caseNUmber;
    double caseOne;
    String todaysDate;
    String[] splitStringArray;

    public Question14(){
        //start from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a case number from 1 to 3: ");
        try {
            caseNUmber = Integer.parseInt(scanner.next());
            switch (caseNUmber){
                case 1:{
                    System.out.println("please enter a number to find the square root of: ");
                    int someThingToTest = Integer.parseInt(scanner.next());
                    caseOne = findSquareRoot(someThingToTest);
                    System.out.println("The square root is: " + caseOne);
                    break;
                }
                case 2:{
                    todaysDate = getTodaysDate();
                    System.out.println("Today's date is: " + todaysDate);
                    break;
                }
                case 3:{
                    System.out.println("Please enter string to store in array");
                    String toSplit = scanner.next();
                    splitStringArray = splitThisString(toSplit);
                    System.out.println("the split string is: " + splitStringArray);
                    break;
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
        String[] returnString = splitTHis.split(" ",10);
        for(String str:returnString){
            System.out.println(str);;
        }
        return returnString;
    }

    public int getCaseNUmber() {
        return caseNUmber;
    }

    public void setCaseNUmber(int caseNUmber) {
        this.caseNUmber = caseNUmber;
    }

    public double getCaseOne() {
        return caseOne;
    }

    public void setCaseOne(double caseOne) {
        this.caseOne = caseOne;
    }

    public void setTodaysDate(String todaysDate) {
        this.todaysDate = todaysDate;
    }

    public String[] getSplitStringArray() {
        return splitStringArray;
    }

    public void setSplitStringArray(String[] splitStringArray) {
        this.splitStringArray = splitStringArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question14)) return false;
        Question14 that = (Question14) o;
        return getCaseNUmber() == that.getCaseNUmber() &&
                Double.compare(that.getCaseOne(), getCaseOne()) == 0 &&
                Objects.equals(getTodaysDate(), that.getTodaysDate()) &&
                Arrays.equals(getSplitStringArray(), that.getSplitStringArray());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getCaseNUmber(), getCaseOne(), getTodaysDate());
        result = 31 * result + Arrays.hashCode(getSplitStringArray());
        return result;
    }

}

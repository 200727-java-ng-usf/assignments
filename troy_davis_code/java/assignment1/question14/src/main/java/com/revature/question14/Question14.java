/*
    Q14. Write a program that demonstrates the switch case. Implement the following functionalities in the cases:java
        Case 1: Find the square root of a number using the Math class method.
        Case 2: Display today’s date.
        Case 3: Split the following string and store it in a string array.
           	“I am learning Core Java”
 */
package com.revature.question14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;


public class Question14 {
    private int caseNUmber;
    double caseOne;
    String todaysDate;
    String[] splitStringArray;

    public Question14(){
        //start from console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //perform the switch evaluation upon instantiation
        System.out.println("please enter a case number from 1 to 3: ");
        try {
            //get the case number
            caseNUmber = Integer.parseInt(reader.readLine());
            switch (caseNUmber){
                case 1:{
                    System.out.println("please enter a number to find the square root of: ");
                    //parse the given return and cast it to an int
                    int someThingToTest = Integer.parseInt(reader.readLine());
                    //invoke the method to find the square root and store the return in the class field
                    caseOne = findSquareRoot(someThingToTest);
                    System.out.println("The square root is: " + caseOne);
                    break;
                }
                case 2:{
                    //invoke the method to find today's date and store the return in the class field
                    todaysDate = getTodaysDate();
                    System.out.println("Today's date is: " + todaysDate);
                    break;
                }
                case 3:{
                    System.out.println("Please enter string to store in array");
                    //get the string to split
                    String toSplit = reader.readLine();
                    //invoke the method to split the given string and store the return in the class field
                    splitStringArray = splitThisString(toSplit);
                    System.out.println("the split string is: " + Arrays.toString(splitStringArray));
                    break;
                }
            }
        }catch (IOException e){
            //print the stack trace
            e.printStackTrace();
            System.out.println("please enter valid responses!");
        }

    }

    public double findSquareRoot(double findThis){
        //find square root using the Java Math Class
        return Math.sqrt(findThis);
    }
    public String getTodaysDate(){
        //create empty string
        String returnString = "";
        //create new date format object
        DateFormat date = new SimpleDateFormat("dd/MM/yy");
        //create new date object
        Date dateObject = new Date();
        //return the string with the correct format
        returnString = date.format(dateObject);
        return returnString;
    }
    public String[] splitThisString(String splitTHis){
        //split the string using spaces as the delimiter
        String[] returnString = splitTHis.split(" ");
        //return the string
        return returnString;
    }

    //Generated getters and setters
    public int getCaseNUmber() {
        return caseNUmber;
    }

    public void setCaseNUmber(int caseNUmber) { this.caseNUmber = caseNUmber; }

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

    @Override
    public String toString() {
        return "Question14{" +
                "caseNUmber=" + caseNUmber +
                ", caseOne=" + caseOne +
                ", todaysDate='" + todaysDate + '\'' +
                ", splitStringArray=" + Arrays.toString(splitStringArray) +
                '}';
    }
}

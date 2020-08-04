package assignment.questions;

import java.util.Date;

public class Q14 {
    public void switchMethod(int n){
        int exampleCase = n;
        int squareRootNumber = 4;
        String exampleString = "I am learning Core Java";
        switch(exampleCase){
            case 1:
                //using Math to get square root of a number
                double sqrt = Math.sqrt(squareRootNumber);
                System.out.println("The square root of " + squareRootNumber + " is " + sqrt);
                break;
            case 2:
                //importing date to create a timestamp
                Date today = new Date();
                System.out.println("Today is " + today);
                break;
            case 3:
                //splitting the string using the whitespace regex
                String[] splitString = exampleString.split("\\s+");
                System.out.print("[");
                //array doesn't seem to want to print anything but the memory space
                //using a for loop to print it out instead
                for (String word: splitString){
                    System.out.print(word + ", ");
                }
                System.out.print("]");

        }
    }
}

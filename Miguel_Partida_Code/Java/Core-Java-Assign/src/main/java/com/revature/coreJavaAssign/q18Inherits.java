package com.revature.coreJavaAssign;


import java.util.Scanner;

public class q18Inherits extends q18Subclass{
    public q18Inherits(String thisString){
        //this will get thisString from the superclass
        super(thisString);
    }
    public String userToInt(){

        String thisString;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word: ");


        //this will convert the scanner to a string
        thisString = input.next();

        q18Subclass userInput = new q18Subclass(thisString);
        //this is the method that will check if there is an uppercase letter inside the string
        boolean checkIfUpper = userInput.upperCase();

        if (checkIfUpper){
            System.out.println(thisString+" has uppercase letters");
        }else{
            System.out.println(thisString+" has no uppercase letters");
        }

        String allUpper = userInput.convertToUpper();
        System.out.println(allUpper+" this is "+ thisString+" but all uppercase");

        int stingPlusTen = userInput.convertToInt();
        System.out.println(thisString + " as an int plus ten is "+ stingPlusTen);

        return thisString;
}
}

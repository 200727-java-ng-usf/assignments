package com.revature.assignment1;
/* Done */
import java.util.Scanner;

public class Q16CountString {

    /*
    Nex step is to assign the scanner to the String field and then use a method using the atChar() to
    count the number of Chars in the string that was entered using the scanner.
    * */
    public static void main(String[] args)
    {
        System.out.print("Type something here: ");
        Scanner inputScanner = new Scanner(System.in);

        String[] inputString = new String[1]; // String will be used to store the input
        // This creates a new Scanner object that will take in an input from the User
        inputString[0] = inputScanner.nextLine();
        CountString(inputString);

    }

    // The CountString method will be used to Calculate the number of Chars of
    // the inputString.
    static int CountString (String[] str)
    {



        int stringCount = 0; // This will store the string count from the CountString Method



        // Need to insert a for loop to iterate through the given string
        for(int i = 0; i < str[0].length(); i++){
            stringCount++;
        }

        System.out.println("Number of characters is: " + stringCount);

        return stringCount;
    }
    /*public int charAt()
    {
        
    } return;*/



}

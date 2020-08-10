package com.revature;
import java.util.Scanner;

public class QuestionSixteen {

    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);

        System.out.print("Please enter a string: "); // asking user to input a string
        String str = txt.nextLine(); //accepts user input
        int count = 0; //initialize the count field

        for(int i = 0 ; i < str.length() ; i ++ ){ //iterate through the string char by char...
            if (str.charAt(i)!=' ') //if the character at i isn't a space...
                count++; //increment count
        }

        System.out.println(count);

    }
}

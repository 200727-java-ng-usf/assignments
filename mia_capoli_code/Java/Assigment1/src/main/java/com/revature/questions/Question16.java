package com.revature.questions;

public class Question16 {

    public static int main(String[] args) {
        //for every word provided in main declaration, add that to the word.
        String word = "";
        for (String arg : args) {
            if (arg != null) {
                word = word.concat(arg);
            }
        }
        //get the length of the string.
        int amountOfChars = word.length();
        System.out.print("Your word has " + amountOfChars + " characters.");

        return amountOfChars;
    }
}

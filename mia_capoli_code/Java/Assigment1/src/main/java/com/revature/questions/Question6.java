package com.revature.questions;

public class Question6 {

    public boolean isEven(int number){
// initalize the boolean
        boolean isEven = false;
        // convert the integer to a string
        String checker = Integer.toString(number);
        //get the last character of the string
        char lastChar = checker.charAt(checker.length() - 1);
        //convert back to an integer
        String lastString = Character.toString(lastChar);
        int lastNumb = Integer.parseInt(lastString);
        //if the last integer from the original input is an even number, the number is even
        if (lastNumb == 0 || lastNumb == 2 || lastNumb == 4 || lastNumb == 6 || lastNumb == 8){
            isEven = true;
        }
        return isEven;


    }
}

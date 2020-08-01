package com.revature.questions;

public class Question6 {

    public boolean isEven(int number){

        boolean isEven = false;
        String checker = Integer.toString(number);
        char lastChar = checker.charAt(checker.length() - 1);
        String lastString = Character.toString(lastChar);
        int lastNumb = Integer.parseInt(lastString);

        if (lastNumb == 0 || lastNumb == 2 || lastNumb == 4 || lastNumb == 6 || lastNumb == 8){
            isEven = true;
        }
        return isEven;


    }
}

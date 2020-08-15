package com.revature.questions;
import com.revature.questions.extras.Question18Subclass;

public class Question18 {
    public static void main(String[] args) {
        //main class to run declared methods.
        Question18Subclass question18 = new Question18Subclass();
        System.out.println(question18.checkUppercase());
        System.out.println(question18.convertToLowercase());
        System.out.println(question18.convertStringToInt());
    }
}

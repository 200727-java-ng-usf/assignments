package com.revature;

import com.revature.questions.Question1;
import com.revature.questions.Question2;
import com.revature.questions.Question3;
import com.revature.questions.Question4;

public class Assignment1Driver {

    public static void main(String[] args) {
        Question1 questionOne = new Question1();
        questionOne.bubbleSort();
        System.out.println("+---------------------");
        Question2 questionTwo = new Question2();
        questionTwo.fibonacciSequence();
        System.out.println("+---------------------");
        Question3 questionThree = new Question3();
        questionThree.stringReverse();
        System.out.println("+---------------------");
        Question4 questionFour = new Question4();
        System.out.println(questionFour.computeFactorial(5));
    }

    public void printValues(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }

    }

}

package com.revature;

import com.revature.questions.*;

public class Assignment1Driver {

    public static void main(String[] args) {
//        Question1 questionOne = new Question1();
//        System.out.println(questionOne.bubbleSort(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
//        System.out.println("+---------------------");
//        Question2 questionTwo = new Question2();
//        questionTwo.fibonacciSequence();
//        System.out.println("+---------------------");
//        Question3 questionThree = new Question3();
//        questionThree.stringReverse("Princess");
//        System.out.println("+---------------------");
//        Question4 questionFour = new Question4();
//        System.out.println(questionFour.computeFactorial(5));
//        System.out.println("+---------------------");
//        Question5 questionFive = new Question5();
//        System.out.println(questionFive.substringMethod("Hogwarts", 3));
        Question6 questionSix = new Question6();
        System.out.println(questionSix.isEven(5));


    }

    public void printValues(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }

    }

}

package com.revature;

import com.revature.questions.*;

public class Assignment1Driver {

    public static void main(String[] args) {
//        Question1 questionOne = new Question1();
//        System.out.println(questionOne.bubbleSort());
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
//        Question6 questionSix = new Question6();
//        System.out.println(questionSix.isEven(5));
//        Question8 questionEight = new Question8();
//        questionEight.Palindromes();
//        Question9 questionNine = new Question9();
//        questionNine.printPrime();
//        Question10 questionTen = new Question10();
//        questionTen.minimumNumber(10, 8);
//        Question11A question11A = new Question11A();
//        question11A.aquireFarFloats();
//        Question12 question12 = new Question12();
//        question12.getEvenNumbers();
//        Question13 question13 = new Question13();
//        question13.pyramid();
        Question14  question14 = new Question14();
        question14.switchCase(3);

    }

    public void printValues(Object[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }

    }

}

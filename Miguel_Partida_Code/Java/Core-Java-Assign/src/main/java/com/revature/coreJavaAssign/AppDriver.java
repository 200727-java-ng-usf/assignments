package com.revature.coreJavaAssign;

import static com.revature.coreJavaAssign.q12StoreArray.*;
import static com.revature.coreJavaAssign.q1bubbleSort.*;
import static com.revature.coreJavaAssign.q2Fibonacci.*;
import static com.revature.coreJavaAssign.q3Reverse.*;
import static com.revature.coreJavaAssign.q4NFactorial.*;
import static com.revature.coreJavaAssign.q5SubToIdx.*;
import static com.revature.coreJavaAssign.q6EvenNumber.*;
import static com.revature.coreJavaAssign.q10Minimum.*;
import static com.revature.coreJavaAssign.q11Float.*;
import static com.revature.coreJavaAssign.q13Triangle.*;

public class AppDriver extends q15Operators{

    public static void main(String[] args) {

    //    Bubble Sort start
        System.out.println("This is the bubble sort");
        //this is the array
        int[] arr = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
       // this is the array before the bubble sort
        for (int j : arr) {
            System.out.print(j);
        }
        System.out.println(" ");
        System.out.println("+--------------+");
        //this here will bubble sort the numbers
        bubbleSort(arr);

//        for (int j : arr) {
//            System.out.print(j);
//        }
        //Bubble Sort end
        System.out.println(" ");
        System.out.println("+--------------+");

        //Fiboancci start
        System.out.println("This is the first 25 Fibonacci Numbers ");

        int FibonacciNumber = 25;//This is the number of times that the Fibonacci number will incriment

        FibonacciN(FibonacciNumber);

        //Fiboancci end
        System.out.println(" ");
        System.out.println("+--------------+");


        //Reverse String start
        //This is the string that will be reversed
        String reverseString = "ReverseString";

        reverseString(reverseString);

        //Reverse String end
        System.out.println(" ");
        System.out.println("+--------------+");
        //Factorial Start

        // Here we will throw a previously used FibonacciNumber to example the factorial method
        factorial(FibonacciNumber);

        System.out.println("Factorial of " + FibonacciNumber + " is " + factorial(FibonacciNumber));

        //Factorial End

        System.out.println("+--------------+");
        // Substring index method starts here

        // this is the index number that the method will use
        // we will be using reverseString
        int idx = 7;
        System.out.println("idx: " + idx + " " + "String: " + reverseString);

        String newSubString = subString(idx, reverseString);

        System.out.println(newSubString);
        //Substring index method ends here
        System.out.println("+--------------+");


        //Even Number method starts here
        // will be using FibonacciNumber for int
        isItEven(FibonacciNumber);

        //Even Number method ends here
        System.out.println("+--------------+");

        //Minimum number method starts here

        minNumber(FibonacciNumber, idx);

        //Minimum Number method ends here

        System.out.println("+--------------+");
        // Access floats from another package

        floatsFromThere();

        //Access floats from another package end here
        System.out.println("+--------------+");

        // Store Away starts here

        even100();

        System.out.println(" ");
        System.out.println("+--------------+");
        //The triangle will be made here
        makeTriangle();

        System.out.println(" ");
        System.out.println("+--------------+");

        // q15 Operators Method

        AppDriver operators = new AppDriver();
        int x = 555;
        int y = 555;
        System.out.println(operators.addition(x,y));
        System.out.println(operators.subtraction(x,y));
        System.out.println(operators.division(x,y));
        System.out.println(operators.multiplacation(x,y));
        System.out.println("+--------------+");







    }
}

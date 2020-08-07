package com.revature.coreJavaAssign;


import com.revature.coreJavaAssign.q7SortEmployees;

import java.util.ArrayList;

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

public class AppDriver extends q15Operators  {

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
        //Q1 this here will bubble sort the numbers
        q1bubbleSort(arr);

//        for (int j : arr) {
//            System.out.print(j);
//        }

        System.out.println(" ");
        System.out.println("+--------------+");

        System.out.println("This is the Fibonacci number is");

        //Q2 Fiboancci start
        System.out.println("This is the first 25 Fibonacci Numbers ");

        int FibonacciNumber = 25;//This is the number of times that the Fibonacci number will incriment

        q2Fibonacci(FibonacciNumber);


        System.out.println(" ");
        System.out.println("+--------------+");

        System.out.println("This is the Reverse String");


        //Q3 Reverse String start
        //This is the string that will be reversed
        String reverseString = "ReverseString";

        String charReverse = "";

        charReverse =  q3reverse(reverseString);

        System.out.println(charReverse);


        System.out.println(" ");
        System.out.println("+--------------+");
        //Q4 Factorial Start

        System.out.println("This is the Factorial method");

        // Here we will throw a previously used FibonacciNumber to example the factorial method
        factorial(FibonacciNumber);

        System.out.println("Factorial of " + FibonacciNumber + " is " + factorial(FibonacciNumber));

        System.out.println("+--------------+");
        //Q5 Substring index method starts here

        // this is the index number that the method will use
        // we will be using reverseString
        int idx = 7;
        System.out.println("idx: " + idx + " " + "String: " + reverseString);

        String newSubString = subString(idx, reverseString);

        System.out.println(newSubString);

        System.out.println("+--------------+");

        //Q6Even Number method starts here
        // will be using FibonacciNumber for int
        isItEven(FibonacciNumber);


        System.out.println("+--------------+");
        //Q7 Starts here
        q7SortEmployees emp1 = new q7SortEmployees("Goku","Marketing",25);
        q7SortEmployees emp2 = new q7SortEmployees("Vegeta","Customer-Service",24);

        ArrayList<q7SortEmployees> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);

        System.out.println("This compares Names");
        employees.sort(new q7SortEmployees.compareName());
        for(q7SortEmployees E: employees){
            System.out.println(E);
        }
        System.out.println("\n");

        System.out.println("This compares Department");
        employees.sort(new q7SortEmployees.compareDepartment());
        for(q7SortEmployees E: employees){
            System.out.println(E);
        }
        System.out.println("\n");

        System.out.println("This compares Age");
        employees.sort(new q7SortEmployees.compareAge());
        for(q7SortEmployees E: employees){
            System.out.println(E);
        }

        System.out.println("+--------------+");



        //Q10 Minimum number method starts here

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

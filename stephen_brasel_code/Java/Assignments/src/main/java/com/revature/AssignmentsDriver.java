package com.revature;

import com.revature.questions.*;

public class AssignmentsDriver {
//    Due: Pushed to your personal branch on the batch “Assignments” repository by Friday, August 07, at 10am EST.

    //    Directions: In an IDE, create one Maven project for the homework with a separate class for each question,
//    use comments liberally in your code.
//    In addition, write a JUnit test suite for each question,
//    writing multiple test cases for each method you create.
    public static void main(String[] args) throws Exception {
        Q1BubbleSort q1bubbles = new Q1BubbleSort();
        {
            int[] bubbles = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
            q1bubbles.BubbleSort(bubbles);
            printValues(bubbles);
            System.out.println();
        }
        Q2Fibonacci q2fib = new Q2Fibonacci();
        {
            int len = 25;
            int[] fib = new int[len];
            q2fib.fibonacci(fib, len);
            printValues(fib);
            System.out.println();
        }
        //TODO String Reversal
        Q3StringReversal q3str = new Q3StringReversal();
        {
            String str = "ReverseMe";
            str = q3str.reverseString(str);
            System.out.println(str);
        }
        Q4Factorial q4fac = new Q4Factorial();
        {
            int n = 10;
            for (int i = 0; i <= n; i++) {
                System.out.print(q4fac.Factorial(i));
                if (i < n) {
                    System.out.print(", ");
                }
            }
        }
        Q15MathInterface q15matI = new Q15MathInterface();
        {
            double x = 5.0D;
            double y = 10.0D;
            double add = q15matI.add(x, y);
            double sub = q15matI.subtract(x, y);
            double mul = q15matI.multiply(x, y);
            double div = q15matI.divide(x, y);
            System.out.println();
            System.out.println(
                    "Added: " + add + "\n" +
                    "Subtracted: " + sub + "\n" +
                    "Multiplied: " + mul + "\n" +
                    "Divided: " + div + "\n"
            );
        }
    }

    public static void printValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}

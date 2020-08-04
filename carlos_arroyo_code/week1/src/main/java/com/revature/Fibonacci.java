package com.revature;

public class Fibonacci {



    public Fibonacci(int test1) {
    }

    public static void main(String[] args) {

        int count = 25;
        int num1 = 0;
        int num2 = 1;

        System.out.println("Fibonacci numbers");

        for (int i = 1; i <= count; i++) {
            /*
                Prints Fibonacci every iteration
                 System.out.println("Fibonacci numbers " + num1 + " ");

             */
            System.out.print(num1 + " ");

            /*

                Assigning second number to num1 and assigning the sum of last two
                numbers to the second number

             */

            int sumOf2 = num1 + num2;
            num1 = num2;
            num2 = sumOf2;
        }
    }
}

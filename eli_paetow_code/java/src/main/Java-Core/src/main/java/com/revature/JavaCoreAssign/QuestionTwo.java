package com.revature.JavaCoreAssign;

//Write a program to display the first 25 Fibonacci numbers beginning at 0.
public class QuestionTwo {



    public static void fibonacciQ2(int num){
        int num1=0;
        int num2=1;

        /**
         * if numbeer is less than one dont return anything
         * */
        if (num < 1)
            return;

        /**
         *while i is less than the number print num2
         * then add the 2 together
         * set result = num 2 and start loop over
         * */

        for (int i =1; i <=num; i++){
            System.out.println(num2 + "");
            int next = num1 + num2;
            num1 = num2;
            num2= next;
        }


    }

    public static void main(String[] args) {
        fibonacciQ2(25);
    }

}

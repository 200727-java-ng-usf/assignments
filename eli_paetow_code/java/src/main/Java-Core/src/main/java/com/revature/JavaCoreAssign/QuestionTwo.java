package com.revature.JavaCoreAssign;

//Write a program to display the first 25 Fibonacci numbers beginning at 0.
public class QuestionTwo {

    public static void fibonacciQ2(int num){
        int num1=0;
        int num2=1;

        //if number is less than one dont return anything
        if (num < 1)
            return;

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

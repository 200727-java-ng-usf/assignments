package com.revature;

public class QuestionTen {

    public static void main(String[] args) {

        // initialized field a with a value of int 98
        int a = 98;

        // initialized field b with a value of int 6
        int b = 6;

        // utilized ternary operator to check if field a was a lower value than field b
        // then initialize field min with the result
        int min = a <= b ? a : b;

        // print the field min containing the result (Should be 6)
        System.out.println(min);

    }
}

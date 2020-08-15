package com.revature.question11;

import com.revature.question11.models.FloatVariables;

public class Question11 extends FloatVariables {
    public static void main(String[] args) {

        FloatVariables numbers = new FloatVariables();
        System.out.println("First number " + numbers.num);
        System.out.println("Second number " + numbers.num1);

        double sum = numbers.num + numbers.num1;
        System.out.println("Sum of float numbers is " + sum);
    }
}

package com.revature.questions;

public class Question10 {
    public int minimumNumber(int a, int b) {

        //using a ternary, get the smallest number.
        int minimum = (a < b) ? a : b;
        String minimumString = "The minimum is " + minimum;

        //return the smallest number.
        System.out.println(minimum);
        return minimum;
    }
}

package com.revature.questions;

public class Question10 {
    public int minimumNumber(int a, int b) {
        int minimum = (a < b) ? a : b;
        String minimumString = "The minimum is " + minimum;
        System.out.println(minimum);
        return minimum;
    }
}

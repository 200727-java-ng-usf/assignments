package com.revature.JavaCoreAssign;

// Q10. Find the minimum of two numbers using ternary operators.

public class QuestionTen {

    /**
     *ternary operator takes the smaller number and return it
     * */
    public static int xIsLessThanY(int x, int y){
        int smallerNum = x < y ? x:y;
        return smallerNum;

    }
}

package com.revature.assignment1;

import com.revature.assignment1.misc.InterfaceQ15;

public class Q15Interface implements InterfaceQ15 {


    public static void main(String[] args) {


    }

    @Override
    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}

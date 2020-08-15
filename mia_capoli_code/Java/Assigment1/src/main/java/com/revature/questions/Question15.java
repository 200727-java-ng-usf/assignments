package com.revature.questions;

import com.revature.interfaces.MathMethods;

public class Question15 implements MathMethods {
    //addition method implementation
    @Override
    public double additionM(double a, double b) {
        System.out.println(a + b);
        return a + b;
    }
    //subtraction method implementation
    @Override
    public double subtractionM(double a, double b) {
        System.out.println(a - b);
        return a - b;
    }
    //multiplication method implementation
    @Override
    public double multiplicationM(double a, double b) {
        System.out.println(a * b);
        return a * b;
    }
    //division method implementation
    @Override
    public double divisionM(double a, double b) {
        System.out.println(a / b);
        return a / b;
    }
}

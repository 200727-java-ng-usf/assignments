package com.revature.questions;

import com.revature.interfaces.MathMethods;

public class Question15 implements MathMethods {

    @Override
    public double additionM(double a, double b) {
        return a + b;
    }

    @Override
    public double subtractionM(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicationM(double a, double b) {
        return a * b;
    }

    @Override
    public double divisionM(double a, double b) {
        return a / b;
    }
}

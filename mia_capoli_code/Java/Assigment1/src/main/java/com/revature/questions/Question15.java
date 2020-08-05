package com.revature.questions;

import com.revature.interfaces.MathMethods;

public class Question15 implements MathMethods {

    @Override
    public int additionM(int a, int b) {
        return a + b;
    }

    @Override
    public int subtractionM(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicationM(int a, int b) {
        return a * b;
    }

    @Override
    public int divisionM(int a, int b) {
        return a / b;
    }
}

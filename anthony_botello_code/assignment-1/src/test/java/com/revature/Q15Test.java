package com.revature;

import static org.junit.Assert.assertTrue;

import com.revature.Q15.Calculator;

import org.junit.Test;

public class Q15Test {
    
    @Test // test arithmetic operations;
    public void testArithmeticOperations(){

        int a = 5;
        int b = 12;
        Calculator calculator = new Calculator();

        assertTrue(calculator.add(a,b) == a + b);
        assertTrue(calculator.subtract(a, b) == a - b);
        assertTrue(calculator.multiply(a, b) == a * b);
        assertTrue(calculator.divide(a, b) == a / b);
    }
}
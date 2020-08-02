package com.revature.Q15;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator showTest = new Calculator();

    @Test
    public void add() {
        assertEquals(3,showTest.add(1,2));
    }

    @Test
    public void sub() {
        assertEquals(2,showTest.sub(5,3));
    }

    @Test
    public void mul() {
        assertEquals(12,showTest.mul(3,4));
    }

    @Test
    public void div() {
        assertEquals(3,showTest.div(27,9));
    }
}
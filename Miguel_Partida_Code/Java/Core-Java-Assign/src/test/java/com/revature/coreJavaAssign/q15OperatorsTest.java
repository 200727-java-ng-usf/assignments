package com.revature.coreJavaAssign;

import org.junit.Test;

import static org.junit.Assert.*;

public class q15OperatorsTest {

    int x = 5;
    int y = 5;
    int addAnswer = 10;

    @Test
    public void addition() {
        AppDriver operators = new AppDriver();
        assertEquals(addAnswer, operators.addition(x,y));
    }

    @Test
    public void subtraction() {
    }

    @Test
    public void multiplacation() {
    }

    @Test
    public void division() {
    }
}
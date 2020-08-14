package com.revature.coreJavaAssign;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class q15OperatorsTest {
    private  q15Operators sut;
    int x = 5;
    int y = 5;

    @Before
    public void setUp() {
        sut = new q15Operators() {
        };
    }



    @Test
    public void addition() {
        int addAnswer = 10;
        assertEquals(addAnswer, sut.addition(x,y));
    }

    @Test
    public void subtraction() {
        int subAnswer = 0;
        assertEquals(subAnswer,sut.subtraction(x,y));
    }

    @Test
    public void multiplacation() {
        int multiAnswer = 25;
        assertEquals(multiAnswer,sut.multiplacation(x,y));
    }

    @Test
    public void division() {
        int divAnswer = 1;
        assertEquals(divAnswer,sut.division(x,y));
    }

    @Test
    public void divideBy0(){
        int z =0;
        int expected = 0;
        assertEquals(expected,sut.division(z,y));
    }
}
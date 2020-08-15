package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionFifteenTest {

    QuestionFifteen sut;


    @Before
    public void setUp(){

        sut = new QuestionFifteen();
    }

    @Test
    public void testForAddition(){
        String msg = "Testing for the addition operation";
        int ta = 4;
        int tb = 8;
        int expected = 12;
        assertEquals(msg,expected,sut.add(ta,tb));

    }

    @Test
    public void testForSubtraction(){
        String msg = "Testing for the subtraction operation";
        int ta = 4;
        int tb = 8;
        int expected = 4;
        assertEquals(msg,expected,sut.subtract(ta,tb));


    }

    @Test
    public void testForMultiplication(){
        String msg = "Testing for the multiplication operation";
        int ta = 4;
        int tb = 8;
        int expected = 32;
        assertEquals(msg,expected,sut.multiply(ta,tb));

    }

    @Test
    public void testForDivision(){
        String msg = "Testing for the division operation";
        int ta = 4;
        int tb = 8;
        int expected = 2;
        assertEquals(msg,expected,sut.divide(ta,tb));

    }


    @After
    public void tearDown(){

    }

}

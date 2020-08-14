package com.revature.coreJavaAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class q10MinimumTest {
    private q10Minimum sut;

    @Before
    public void setUp(){
        sut = new q10Minimum();
    }

    @After
    public void tearDown(){
        sut =null;
    }

    @Test
    public void test123And321() {
        int actual1 = 123;
        int actual2 =321;
        int expected = 321;
        assertEquals(expected,sut.minNumber(actual1,actual2));
    }

    @Test
    public void test0AndN1() {
        int actual1 = 0;
        int actual2 =-1;
        int expected = -1;
        assertEquals(expected,sut.minNumber(actual1,actual2));
    }

    @Test
    public void testnothing(){
        int actual1 = 0;
        int acutal2=0;
        int expected= 0;
        assertEquals(expected,sut.minNumber(actual1,acutal2));

    }
}
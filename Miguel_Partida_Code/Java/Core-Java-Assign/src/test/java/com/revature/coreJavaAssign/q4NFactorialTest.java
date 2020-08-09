package com.revature.coreJavaAssign;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class q4NFactorialTest {
    private q4NFactorial sut;

    @Before
    public void setUp() throws Exception {
        sut = new q4NFactorial();
    }

    @Test
    public void factorialOf4() {
        int actual = 4;
        int expected =24;
        assertEquals(expected,sut.q4NFactorial(actual));
    }
    @Test
    public void factorial() {
        int actual = -1;
        int expected = 0;
        assertEquals(expected, sut.q4NFactorial(actual));
    }


}
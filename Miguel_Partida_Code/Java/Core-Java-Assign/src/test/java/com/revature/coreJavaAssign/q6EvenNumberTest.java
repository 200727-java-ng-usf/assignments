package com.revature.coreJavaAssign;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class q6EvenNumberTest {
    private q6EvenNumber sut;

    @Before
    public void setUp() {
        sut = new q6EvenNumber();
    }

    @Test
    public void test1222ToGetEven() {
        int actual = 1222;
        String expected = "even";
        assertEquals(expected,sut.isItEven(actual));

    }
    @Test
    public void testNegative1222ToGetNull() {
        int actual = -1222;
        String expected = "";
        assertEquals(expected,sut.isItEven(actual));

    }
}
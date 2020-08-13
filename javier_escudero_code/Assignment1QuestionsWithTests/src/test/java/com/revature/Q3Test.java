package com.revature;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q3Test {

    private Q3 sut;

    @Before
    public void t1Setup(){
        sut = new Q3();
    }


    @Test
    public void testReverseMethod() {
        StringBuilder testSb = new StringBuilder("abc");
        String expectedString = "cba";
        assertEquals(expectedString, sut.reverseMethod(testSb));
    }

    @Test
    public void testReverseMethodAlphaNumeric() {
        StringBuilder testSb = new StringBuilder("abc 123");
        String expectedString = "321 cba";
        assertEquals(expectedString, sut.reverseMethod(testSb));
    }
}

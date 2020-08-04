package com.revature.Q18;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringMethodTest {
    stringImplement showCase = new stringImplement();


    @Test
    public void checkIfUpperCase() {
        assertEquals(true,showCase.checkIfUpperCase("Abc"));
    }

    @Test
    public void uppercaseConverter() {
        assertEquals("ABC",showCase.uppercaseConverter("abc"));
    }

    @Test
    public void addTen() {
        showCase.addTen("10");
    }
}
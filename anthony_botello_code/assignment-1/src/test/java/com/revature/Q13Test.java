package com.revature;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Q13Test {
    
    @Test // tests that 'printTriangle' returns correct array of Strings
    public void testPrintTriangle(){

        String[] expected = {"0", "10", "101", "0101"};
        String[] result = Q13.printTriangle();

        assertArrayEquals(expected, result);
    }
}
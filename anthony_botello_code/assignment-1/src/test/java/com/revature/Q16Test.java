package com.revature;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Q16Test {
    
    @Test //tests that Q16 class displays string length from main method argument
    public void testQ16DisplaysStringLength(){

        String string = "This is a test string.";

        Q16.main(string);

        int expected = string.length();
        int result = Q16.getStringLength();

        assertTrue(expected == result);
    }
}
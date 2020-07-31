package com.revature;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.revature.util.Misc;

import org.junit.Test;

/**
 * Unit test for Q3
 */

public class Q3Test {

    @Test // Tests that 'reverseString' returns null when given null input
    public void testIfNullStringReturnsNull(){

        assertNull(Q3.reverseString(null));
    }
    
    @Test // Tests that 'reverseString' method returns the input String in reverse
    public void testIfStringReversed(){

        // Test for empty String
        assertTrue(Q3.reverseString("").equals(""));

        // Test for explicitly defined String and its reverse
        String testString = "Test string";
        String reversedTestString = "gnirts tseT";

        assertTrue(Q3.reverseString(testString).equals(reversedTestString));

        // Test for random UTF-8 String of random length between 0 and 1000
        testString = Misc.getRandomAlphaString();
        
        reversedTestString = new String(testString); // new String object with same value as testString
        reversedTestString = new StringBuilder(reversedTestString).reverse().toString(); // reverses using native StringBuilder 'reverse' method

        testString = Q3.reverseString(testString); // reverses test string using Q3 'reverseString' method

        assertTrue(testString.equals(reversedTestString));
    }
}
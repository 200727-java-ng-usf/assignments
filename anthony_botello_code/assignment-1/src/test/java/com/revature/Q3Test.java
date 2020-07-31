package com.revature;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Q3
 */

public class Q3Test {

    @Test // Tests that 'reverseString' returns null when given null input
    public void shouldReturnNullWhenInputIsNull(){

        assertNull(Q3.reverseString(null));
    }
    
    @Test // Tests that 'reverseString' method returns the input String in reverse
    public void shouldReturnReversedInputString(){

        String testString = "Test string";
        String reversedTestString = "gnirts tseT";

        assertTrue(Q3.reverseString(testString).equals(reversedTestString));
    }
}
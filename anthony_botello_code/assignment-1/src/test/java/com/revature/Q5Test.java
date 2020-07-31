package com.revature;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for Q5
 */
public class Q5Test {
   
    @Test // tests that 'substring' method returns empty string when index argument is zero
    public void testReturnsEmptyStringWhenIndexZero(){

        String result = Q5.substring("0123456789", 0);
        assertTrue(result.equals(""));
    }

    /*
        Tests that 'substring' throws StringIndexOutOfBoundsException:
            1) when index argument is negative
            2) when index argument is greater than length of string argument
    */
    @Test 
    public void testThrowsOutOfBoundsException(){

        assertThrows(
            StringIndexOutOfBoundsException.class,
            () -> Q5.substring("0123456789", -1)
        );

        assertThrows(
            StringIndexOutOfBoundsException.class,
            () -> Q5.substring("0123456789", 11)
        );
    }

    @Test // tests 'substring' method returns correct substring
    public void testReturnsSubstring(){

        String result = Q5.substring("0123456789", 5);
        assertTrue(result.equals("01234"));
    }

}   
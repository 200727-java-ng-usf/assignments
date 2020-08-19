package com.revature;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q10Test {

    @Test
    public void minimumOfTwoNumbers() {
        Q10 q10 = new Q10();
        int expected = 11, j = 22;
        int actual = q10.minimumOfTwoNumbers(expected,j); // is j 11

        assertEquals(expected, actual);

    }

    @Test
    public void givenEqualNumbersReturnZero() {
        Q10 q10 = new Q10();
        int expected = 11, j = 11;
        int actual = q10.minimumOfTwoNumbers(expected,j);
        assertNotEquals(expected, actual);
        System.out.println(actual);

    }
}
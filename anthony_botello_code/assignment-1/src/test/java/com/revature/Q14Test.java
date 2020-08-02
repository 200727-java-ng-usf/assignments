package com.revature;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

public class Q14Test {
    
    @Test // tests that null returned when input is less than 1 or more than 3
    public void testNullReturned(){

        assertNull(Q14.switchDemo(0));
        assertNull(Q14.switchDemo(4));
    }

    @Test // tests that case 1 computes a square root
    public void testCase1ComputesSquareRoot(){

        Object result = Q14.switchDemo(1);

        assertTrue(result instanceof double[]);

        double base = ((double[]) result)[0];
        double sqrt = ((double[]) result)[1];

        assertTrue(Math.sqrt(base) == sqrt);
    }

    @Test // tests that case 2 returns today's date
    public void testCase2ReturnsCurrentDate(){

        Object result = Q14.switchDemo(2);

        assertTrue(result instanceof LocalDate);

        LocalDate today = LocalDate.now();

        assertEquals(today, (LocalDate) result);
    }

    @Test // tests that case 3 splits string
    public void testCase3SplitsString(){

        Object result = Q14.switchDemo(3);

        assertTrue(result instanceof String[]);

        String[] expected = "I am learning Core Java".split("");

        assertArrayEquals(expected, (String[]) result);
    }
}
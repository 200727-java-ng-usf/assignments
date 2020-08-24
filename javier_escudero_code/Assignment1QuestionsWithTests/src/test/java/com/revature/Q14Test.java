package com.revature;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Q14Test {
    static public Scanner sc2;
    private Q14 q14;

    @Before
    public void setup() {
        q14 = new Q14();
        sc2 = new Scanner(System.in);
    }

    @Test
    public void testSquareRoot() {
        q14.switchCaseChoices1To3(1);
        assertEquals(3.0, Q14.x, 0);
        }

    @Test
    public void testDate() {
        q14.switchCaseChoices1To3(2);
        String date2 = new Date().toString();
        assertEquals(date2, Q14.date);
    }

    @Test
    public void testSplit() {
        q14.switchCaseChoices1To3(3);
        String substring = "[I, am, learning, Core, Java]";
        assertEquals(substring, Arrays.toString(Q14.st));
    }

    @Test
    public void testInvalidInput() {
        int n = 4;
        q14.switchCaseChoices1To3(n);
    }
}

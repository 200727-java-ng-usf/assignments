package com.revature;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;


public class Q14Test {
    /**
     * Q14. Write a program that demonstrates the switch case. Implement the following functionalities in the cases:java
     * Case 1: Find the square root of a number using the Math class method.
     * Case 2: Display today’s date.
     * Case 3: Split the following string and store it in a string array.
     * “I am learning Core Java”
     */
    static public Scanner sc2;
    // sc2 = new Scanner(System.in);
    private Q14 q14;

    //
    @Before
    public void setup() {
        q14 = new Q14();
//        q14.switchCaseChoices1To3();
        sc2 = new Scanner(System.in);
    }
    @Test
    public void testSquareRoot() {
        int n = 1;
        q14.switchCaseChoices1To3(n);
        assertEquals(3.0, Q14.x, 0);
        }

    @Test
    public void testDate() {
        int n = 2;
        q14.switchCaseChoices1To3(n);
        String date2 = new Date().toString();
        assertEquals(date2, Q14.date);
    }

    @Test
    public void testSplit() {
        int n = 3;
        q14.switchCaseChoices1To3(n);
        String substring = "[I, am, learning, Core, Java]";
        assertEquals(substring, Arrays.toString(Q14.st));
    }

    @Test
    public void testInvalidInput() {
        int n = 4;
        q14.switchCaseChoices1To3(n);
    }
}

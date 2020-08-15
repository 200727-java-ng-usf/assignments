package com.revature;

import org.junit.*;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class Q3Tests {

    // Creating the test system
    private Q3Main sut;

    @BeforeClass
    public static void start() {
        System.out.println("Initiate test...");
        System.out.println("+-----------------+");
    }

    @AfterClass
    public static void stop() {
        System.out.println("All tests complete.");
        System.out.println("+-----------------+");
    }

    @Before
    public void setUp() {
        sut = new Q3Main();
        System.out.println("New Test");
    }

    @After
    public void tearDown() {
        sut = null;
        System.out.println("End of test");
        System.out.println("+-----------------+");
    }

    @Test
    public void reverseString() {

        String original = "Hello";
        String expected = "olleH";
        String actual = "";


        for (int i = original.length() - 1; i >= 0; i--) {
            actual += original.charAt(i);
        }

        assertEquals(expected, actual);
    }



}

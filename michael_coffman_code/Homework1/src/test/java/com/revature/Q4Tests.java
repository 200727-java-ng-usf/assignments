package com.revature;

import org.junit.*;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class Q4Tests {

    // Creating the test system
    private Q4Main sut;

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
        sut = new Q4Main();
        System.out.println("New Test");
    }

    @After
    public void tearDown() {
        sut = null;
        System.out.println("End of test");
        System.out.println("+-----------------+");
    }

    @Test
    public void SevenFactorial() {

        int n = 7;
        int expected = 5040;

        for (long i = n - 1; i > 1; i--) {
            n *= i;
        }

        assertEquals(expected, n);
    }
}
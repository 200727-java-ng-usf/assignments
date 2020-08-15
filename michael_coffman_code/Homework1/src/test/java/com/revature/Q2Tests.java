package com.revature;

import org.junit.*;

import static org.junit.Assert.*;

public class Q2Tests {

    // Creating the test system
    private Q2Main sut;

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
        sut = new Q2Main();
        System.out.println("New Test");
    }

    @After
    public void tearDown() {
        sut = null;
        System.out.println("End of test");
        System.out.println("+-----------------+");
    }

    @Test
    public void fibonacciNumbersSize25() {

        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368};
        int[] actual = new int[25];

        actual[1] = 1;

        for (int i = 2; i < (actual.length); i++) {
            actual[i] = actual[i - 1] + actual[i - 2];
        }

        assertArrayEquals(expected, actual);

    }

}
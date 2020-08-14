package com.revature;

import org.junit.*;

import static org.junit.Assert.*;

public class Q1Tests {

    // Creating the test system
    private Q1Main sut;

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
        sut = new Q1Main();
        System.out.println("New Test");
    }

    @After
    public void tearDown() {
        sut = null;
        System.out.println("End of test");
        System.out.println("+-----------------+");
    }

    @Test
    public void bubbleSort() {
        int[] original = new int[]{1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
        int[] expectedArray = {0, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < (original.length - 1); i++) {

            for (int j = 0; j < (original.length - i - 1); j++) {

                if (original[j] > original[j + 1]) {
                    int temp = original[j];
                    original[j] = original[j + 1];
                    original[j + 1] = temp;
                }
            }
        }
    }



}

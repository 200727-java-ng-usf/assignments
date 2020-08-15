package com.revature;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Q6Tests {

    private Q6Main sut;

    @BeforeClass
    public static void startUp() {
        System.out.println("Beginning Tests...");
    }

    @AfterClass
    public static void testsComplete() {
        System.out.println("Tests complete.");
    }

    @Before
    public void setUp() {
        System.out.println("Start of this test.");
        sut = new Q6Main();
    }

    @After
    public void tearDown() {
        System.out.println("End of current test.");
        sut = null;
    }

    @Test
    public void isEven() {

        // Arrange
        int expected = 6;


        // Act
        int result = expected/2;
        int actual = result*2;

        if (actual == expected) {
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is odd");
        }

        // Assess
        assertEquals(expected, actual);
    }

    @Test
    public void isOdd() {

        // Arrange
        int expected = 5;


        // Act
        int result = expected/2;
        int actual = result*2;

        if (actual == expected) {
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is odd");
        }

        // Assess
        assertNotEquals(expected, actual);
    }

}

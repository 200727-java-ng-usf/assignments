package com.revature;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Q5Tests {

    private Q5Main sut;

    @BeforeClass
    public static void testSetup() {
        System.out.println("Initializing tests...");
    }

    @AfterClass
    public static void testTeardown() {
        System.out.println("Tests complete.");
    }

    @Before
    public void setup() {
        sut = new Q5Main();
        System.out.println("Beginning new test.");
    }

    @After
    public void tearDown() {
        sut = null;
        System.out.println("End of current test.");
    }

    @Test
    public void HelloToHel() {

        // Arrange
        String original = "Hello";
        String expected = "Hel";
        String actual = "";
        int idx = 3;

        // Act
        char[] temp = original.toCharArray();

        for (int i = 0; i < idx; i++) {
            actual += temp[i];
        }

        // Assess
        assertEquals(expected, actual);


    }
}

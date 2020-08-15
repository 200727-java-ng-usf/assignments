package com.revature;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Q8Tests {

    private Q8Main sut;

    @BeforeClass
    public static void beforeAll() {
        System.out.println("Initializing tests...");
        System.out.println("+-----------------------------+");
    }

    @AfterClass
    public static void afterAll() {
        System.out.println("End of testing...");
        System.out.println("+-----------------------------+");
    }

    @Before
    public void setup() {
        System.out.println("New test.");
        sut = new Q8Main();
    }

    @After
    public void tearDown() {
        System.out.println("End of current test");
        sut = null;
    }

    @Test
    public void checkIfStringIsPalindrome() {

        // Arrange
        String original = "racecar";
        String expected = "racecar";
        String actual = "";

        // Act
        for (int i = 0; i < 1; i++) {

            actual = "";
            //char[] tempChar = original.get(i).toCharArray();

            for (int j = original.length(); j > 0; j--) {
                actual += original.charAt(j-1);
            }

            if (actual.equals(original)) {
                System.out.println("The string is a palindromme.");
            }
        }

        // Assess
        assertEquals(expected, actual);
    }


    @Test(expected = StringIndexOutOfBoundsException.class)
    public void invalidStringIndex() {

        // Arrange
        String original = "racecar";
        String expected = "racecar";
        String actual = "";

        // Act
        for (int i = original.length(); i > 0; i--) {
            actual += original.charAt(i+10);
        }

        // Assess

    }
}
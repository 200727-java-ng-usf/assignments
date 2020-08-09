package com.revature;

import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class Q16Tests {

    private Q16Main sut;

    @BeforeClass
    public static void beforeTests() {
        System.out.println("Begin testing of Q16 Methods");
        System.out.println("+-------------------------------------+");
    }

    @AfterClass
    public static void afterTests() {
        System.out.println("Testing complete, exiting program.");
        System.out.println("+-------------------------------------+");
    }

    @Before
    public void setUp() {
        sut = new Q16Main();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void countNumberOfCharactersNoWhiteSpace() {

        int charCount = 0;

        String[] s = {"Hello", "World", "!"};

        for (int i = 0; i < s.length; i++) {
            charCount += s[i].length();
        }
        System.out.println("The String[] you've entered is:");
        System.out.println(Arrays.toString(s));
        System.out.println("The String[] contains " + charCount + " characters.");

    }


}

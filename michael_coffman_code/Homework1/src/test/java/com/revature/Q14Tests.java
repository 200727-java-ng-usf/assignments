package com.revature;

// for square root method
import java.lang.Math;

// for date method
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

// testing dependencies
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Q14Tests {

    private Q14Main sut;

    @Before
    public void setUp() {
        sut = new Q14Main();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void findSquareRootOfInt() {
        double inputValue = 81;
        double expectedResult = 9;
        double actualResult = Math.sqrt(inputValue);
        // making sure sqrt method gave good result
        assertEquals("Square root of 81", expectedResult, actualResult, .001);
    }

    @Test
    public void findSquareRootOfDouble() {
        double inputValue = 87.35;
        double expectedResult = 9.3461221905;
        double actualResult = Math.sqrt(inputValue);
        // making sure sqrt method gave good result
        assertEquals("Square root of 81", expectedResult, actualResult, .001);
    }

    @Test
    public void displayDate() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime date = LocalDateTime.now();
        System.out.println(format.format(date));
        // can't really test with assert
    }

    @Test
    public void splitStringIntoArray() {
        String init = ("I am learning Core Java");
        String[] result = init.split(" ");
        String[] expectedResult = {"I", "am", "learning", "Core", "Java"};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void switchCases() {

        int choice = 2;

        switch (choice) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            }

    }

}

package com.revature;

import org.junit.*;

import java.text.DecimalFormat;

import static org.junit.Assert.assertEquals;

public class Q15Tests {

    private Q15Main sut;


    @BeforeClass
    public static void beforeAll() {
        System.out.println("Beginning class tests.");
        System.out.println("+-----------------------------------+");
    }

    @Before
    public void setUp() {
        System.out.println("Setting up new test.");
        sut = new Q15Main();
    }

    @After
    public void tearDown() {
        System.out.println("Erasing test object.");
        System.out.println("+-----------------------------------+");
        sut = null;
    }

    @AfterClass
    public static void afterAll() {
        System.out.println("End of tests...");
    }

    @Test
    public void addition() {

        double a = 3;
        double b = 4.4;

        double expectedResult = 7.4;
        double actualResult = a + b;

        assertEquals(expectedResult, actualResult, .001);

    }

    @Test
    public void subtract() {

        // I intend to have all numbers rounded to 6th decimal position
        // to prevent problems with doubles.
        DecimalFormat decimal = new DecimalFormat(".######");

        double a = 3.2;
        double b = 2;

        double expectedResult = 1.2;
        double actualResult = a - b;
        System.out.println(decimal.format(actualResult));

        assertEquals(expectedResult, actualResult, .001);

    }

    @Test
    public void multiply() {

        // Decimals to be rounded to 6th place
        DecimalFormat decimal = new DecimalFormat(".######");

        double a = 15.456;
        double b = 3.5;

        double expectedResult = 54.096;
        double actualResult = a * b;

        System.out.println(decimal.format(actualResult));

        assertEquals(expectedResult, actualResult, .001);

    }

    @Test
    public void divide() {

        DecimalFormat decimal = new DecimalFormat(".######");

        double a = 81;
        double b = 9;

        double expectedResult = 9;
        double actualResult = a / b;
        System.out.println(decimal.format(actualResult));

        assertEquals(expectedResult, actualResult, .001);
    }
}

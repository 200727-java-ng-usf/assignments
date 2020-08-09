package com.revature;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Q17Tests {

    private Q17Main sut;

    @BeforeClass
    public static void beforeTests() {
        System.out.println("Begin testing of Q17 Methods");
        System.out.println("+-------------------------------------+");
    }

    @AfterClass
    public static void afterTests() {
        System.out.println("Testing complete, exiting program.");
        System.out.println("+-------------------------------------+");
    }

    @Before
    public void setUp() {
        sut = new Q17Main();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void calculateSimpleInterest() {
        double principle = 1000;
        double rate = 2.5;
        double actualRate = rate/100;
        int years = 1;

        double interest = principle * actualRate * years;
        System.out.println(interest);

    }

}



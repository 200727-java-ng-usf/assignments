package com.revature.testing;

import com.revature.questions.Question9;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class Question9Test {

    private Question9 question9;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        question9 = new Question9();
    }


    @Test
    public void testPrimeNumbersGivenArray() {
        String msg = "If a number is provided, the impl should return an array of numbers in a range of 1 to said number.";
        int size = 100;
        Object[] correctArray = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        Object[] arrayToBeTested = question9.printPrime(size).toArray();
        assertArrayEquals(msg, correctArray, arrayToBeTested);

    }

    @Test
    public void testSolutionWithNullArray() {
        String msg = "If a null array is provided, then impl should return an empty array";
        Object[] expectedArray = {};
        Object[] actualResult = question9.printPrime(0).toArray();
        assertNotNull(actualResult);
        assertArrayEquals(msg, expectedArray, actualResult);

    }

    @After
    public void tearDown() {
        question9 = null;
    }
}


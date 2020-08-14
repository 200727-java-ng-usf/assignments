package com.revature.testing;

import com.revature.questions.Question2;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;


public class Question2Test {

    private Question2 question2;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        question2 = new Question2();
    }

    @Test
    public void testFibonacciSize25() {
        String msg = "This is the question's required fibonacci sequence size.";
        int[] correctArray = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368};
        assertArrayEquals(msg, correctArray, question2.fibonacciSequence(25));

    }

    @Test
    public void testFibonacciSize0() {
        String msg = "This returns an empty array";
        int[] correctArray = {};
        assertArrayEquals(msg, correctArray, question2.fibonacciSequence(0));

    }

    @Test
    public void testFibonacciSize35() {
        String msg = "This returns an array with 35 of the fibonacci sequence numbers";
        int[] correctArray = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887};
        assertArrayEquals(msg, correctArray, question2.fibonacciSequence(35));

    }

    @Test
    public void testFibonacciNegativeSize() {
        String msg = "This returns an array with 35 of the fibonacci sequence numbers";
        question2.fibonacciSequence(-3);

    }

    @After
    public void tearDown() {
        question2 = null;
    }

}

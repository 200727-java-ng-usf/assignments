package com.revature.testing;

import com.revature.questions.Question1;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class Question1Test {

    private Question1 question1;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        question1 = new Question1();
    }



    @Test
    public void testBubbleSortGivenArray() {
        String msg = "If a randomly sorted array is provided, the impl should return the array sorted.";
        int[] testArray = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
        int[] correctArray = {0, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(msg, correctArray, question1.bubbleSort(testArray));

    }

    @Test
    public void testSolutionWithNullArray() {
        String msg = "If a null array is provided, then impl should return an empty array";
        int[] expectedArray = {};
        int[] actualResult = question1.bubbleSort(null);
        assertNotNull(actualResult);
        assertArrayEquals(msg, expectedArray, actualResult);

    }

    @After
    public void tearDown() {
        question1 = null;
    }
}

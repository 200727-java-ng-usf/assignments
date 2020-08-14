package com.revature.testing;

import com.revature.questions.Question12;
import com.revature.questions.extras.Utils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Question12Test {


    private Question12 question12;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        question12 = new Question12();
    }

    @Test
    public void testSize25() {
        String msg = "";
        int[] actualArray = question12.getEvenNumbers(25);
        int[] correctArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24};

        assertArrayEquals(msg, correctArray, actualArray);

    }

    @Test
    public void testSizeZero() {
        String msg = "";
        int[] actualArray = question12.getEvenNumbers(0);
        int[] correctArray = {};

        assertArrayEquals(msg, correctArray, actualArray);

    }


    @After
    public void tearDown() {
        question12 = null;
    }
}

package com.revature.testing;

import com.revature.questions.Question10;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Question10Test {

    private Question10 question10;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        question10 = new Question10();
    }

    @Test
    public void test1and2() {
        String msg = "This is the smallest number.";
        int a = 1;
        int b = 2;
        int correctNumber = a;

        assertEquals(msg, correctNumber, question10.minimumNumber(a,b));

    }

    @Test
    public void testsameNumber() {
        String msg = "This is the smallest number.";
        int a = 100;
        int b = 100;
        int correctNumber = b;

        assertEquals(msg, correctNumber, question10.minimumNumber(a,b));

    }

    @Test()
    public void testNegative4and2() {
        String msg = "This is the smallest number.";
        int a = -4;
        int b = 2;
        int correctNumber = a;

        assertEquals(msg, correctNumber, question10.minimumNumber(a,b));

   }

    @After
    public void tearDown() {
        question10 = null;
    }

}


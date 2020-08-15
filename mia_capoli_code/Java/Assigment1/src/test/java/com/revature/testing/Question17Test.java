package com.revature.testing;


import com.revature.questions.Question17;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;


public class Question17Test {
    private Question17 question17 = new Question17();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        Question17 question17 = new Question17();
    }

    @After
    public void teardown() {
        question17 = null;
    }

    @Test
    public void testcase100_410() {
        double expected_ = 40.0;

        String s = "100.0d\n0.04d\n10";
        ByteArrayInputStream sysIn = new ByteArrayInputStream(s.getBytes());
        System.setIn(sysIn);

        double result = (question17.simpleInterest());
        Assert.assertEquals(expected_, result, .001);
    }

    @Test
    public void testCaseNegativeNumb() {
        double expected = 0;

        String s = "-100.0d\n0.04d\n10";
        ByteArrayInputStream sysIn = new ByteArrayInputStream(s.getBytes());
        System.setIn(sysIn);

        double actual = question17.simpleInterest();
        Assert.assertEquals(expected, actual, .001);
    }

}

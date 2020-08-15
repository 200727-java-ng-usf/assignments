package com.revature.testing;

import com.revature.questions.Question19;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;

public class Question19Test {

    private Question19 question19 = new Question19();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        Question19 question19 = new Question19();
    }

    @After
    public void teardown() {
        question19 = null;
    }

    @Test
    public void testEvenNumbers() {
        String expected = "30";

        String result = question19.addOddAndEvenRemovePrime()[0];

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOddNumbers() {
        String expected = "25";

        String result = question19.addOddAndEvenRemovePrime()[1];

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testNoPrimeArray() {
        String expected = "[2, 4, 8, 10]";
        String result = question19.addOddAndEvenRemovePrime()[2];

        Assert.assertEquals(expected, result);
    }

//
}

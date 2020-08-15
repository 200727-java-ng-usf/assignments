package com.revature.testing;

import com.revature.questions.Question20;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Question20Test {


    private Question20 question20 = new Question20();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        Question20 question18 = new Question20();
    }

    @After
    public void teardown() {
        question20 = null;
    }

    @Test
    public void testCaseCheckFormat() {
        String expected = "Name: Mickey Mouse\n" +
                "Age: 35 years\n" +
                "State: Arizona State\n" +
                "Name: Hulk Hogan\n" +
                "Age: 50 years\n" +
                "State: Virginia State\n" +
                "Name: Roger Rabbit\n" +
                "Age: 22 years\n" +
                "State: California State\n" +
                "Name: Wonder Woman\n" +
                "Age: 18 years\n" +
                "State: Montana State\n";
        String result = (question20.readFromFile());
        Assert.assertEquals(expected, result);
    }

}

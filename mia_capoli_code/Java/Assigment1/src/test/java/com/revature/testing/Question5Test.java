package com.revature.testing;

import com.revature.questions.Question3;
import com.revature.questions.Question5;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertEquals;

public class Question5Test {
    private Question5 question5;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        question5 = new Question5();
    }

    @Test
    public void testString() {
        String msg = "This is what the first 3 letters of this string are.";
        String og = "Hogwarts";
        int number = 3;
        String correct = "Hog";
        assertEquals(msg, correct, question5.substringMethod(og, number));

    }

    @Test
    public void testString2() {
        String msg = "This is what the first letter of this string is.";
        String og = "Hello World";
        int number = 1;
        String correct = "H";
        assertEquals(msg, correct, question5.substringMethod(og, number));
    }

    @Test
    public void testNull() {
        String msg = "This is what null returns";
        String og = null;
        int number = 3;
        String correct = question5.substringMethod("", number);
        assertEquals(msg, correct, question5.substringMethod(null, number));

    }

    @After
    public void tearDown() {
        question5 = null;
    }
}

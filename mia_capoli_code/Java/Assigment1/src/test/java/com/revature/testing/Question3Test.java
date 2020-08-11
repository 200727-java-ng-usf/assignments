package com.revature.testing;

import com.revature.questions.Question2;
import com.revature.questions.Question3;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Question3Test {

    private Question3 question3;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        question3 = new Question3();
    }

    @Test
    public void testString() {
        String msg = "This is what one string looks like reversed";
        String og = "Princess";
        String correct = "ssecnirP";
        assertEquals(msg, correct, question3.stringReverse(og));

    }

    @Test
    public void testString2() {
        String msg = "This is what another string looks like reversed";
        String og = "Potato";
        String correct = "otatoP";
        assertEquals(msg, correct, question3.stringReverse(og));

    }

    @Test
    public void testNumber() {
        String msg = "This is what happens when you give a number";
        String og = "25";
        String correct = "52";
        assertEquals(msg, correct, question3.stringReverse(og));

    }

    @After
    public void tearDown() {
        question3 = null;
    }

}

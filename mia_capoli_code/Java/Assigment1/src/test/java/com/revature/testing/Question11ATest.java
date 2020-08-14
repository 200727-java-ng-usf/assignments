package com.revature.testing;

import com.revature.questions.Question11A;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertEquals;

public class Question11ATest {

    private Question11A question11;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        question11 = new Question11A();
    }

    @Test
    public void testAcquireFloats() {
        String msg = "These are the floats from another package.";
        float[] f = question11.aquireFarFloats();

        float a1 = f[0];
        float b1 = f[1];
        float a2 = 100;
        float b2 = 20;

        assertEquals(a1, a2, .001);
        assertEquals(msg, b1, b2, .001);

    }



    @After
    public void tearDown() {
        question11 = null;
    }

}

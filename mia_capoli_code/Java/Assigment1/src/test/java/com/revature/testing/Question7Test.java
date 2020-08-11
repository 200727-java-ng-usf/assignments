package com.revature.testing;

import com.revature.questions.Question3;
import com.revature.questions.Question7;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Question7Test {

    private Question7 question7;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        question7 = new Question7();
    }

    @Test
    public void testString() {


    }

    @Test
    public void testString2() {


    }

    @Test
    public void testNumber() {


    }

    @After
    public void tearDown() {
        question7 = null;
    }
}

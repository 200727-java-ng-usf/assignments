package com.revature.testing;

import com.revature.questions.Question3;
import com.revature.questions.Question6;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class Question6Test {
    private Question6 question6;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        question6 = new Question6();
    }

    @Test
    public void test2() {
        assertTrue(question6.isEven(2));

    }

    @Test
    public void test51() {
        assertFalse(question6.isEven(51));

    }

//    @Test
//    public void testString() {
//
//    }

    @After
    public void tearDown() {
        question6 = null;
    }
}

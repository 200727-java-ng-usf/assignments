package com.revature.testing;

import com.revature.questions.Question3;
import com.revature.questions.Question4;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertEquals;

public class Question4Test {

    private Question4 question4;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        question4 = new Question4();
    }

    @Test
    public void testFactorialA() {
        String msg = "This is what the factorial of 5 is.";
        int og = 5;
        int correct = 120;
        assertEquals(msg, correct, question4.computeFactorial(og));


    }

    @Test
    public void testFactorialB() {
        String msg = "This is what the factorial of 10 looks like";
        int og = 10;
        int correct = 3628800;
        assertEquals(msg, correct, question4.computeFactorial(og));

    }

//    @Test
//    public void testString() {
//        String msg = "This is what happens when you input a string";
//        String og = "hello";
//        assertEquals(msg, correct, question4.computeFactorial(og));
//          how to test this......
//
//    }

    @After
    public void tearDown() {
        question4 = null;
    }
}

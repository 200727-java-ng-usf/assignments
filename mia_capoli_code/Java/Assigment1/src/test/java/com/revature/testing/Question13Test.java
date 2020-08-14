package com.revature.testing;

import com.revature.questions.Question12;
import com.revature.questions.Question13;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertArrayEquals;

public class Question13Test {

    private Question13 question13 = new Question13();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        Question13 question13 = new Question13();
    }

    @Test
        public void testPyramidArray() {
        String expected = "0\n10\n101\n0101";
        String actual = question13.pyramid();
        Assert.assertEquals(expected, actual);
    }

}

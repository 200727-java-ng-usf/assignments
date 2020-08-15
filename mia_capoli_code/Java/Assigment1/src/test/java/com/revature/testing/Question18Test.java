package com.revature.testing;


import com.revature.questions.Question18;
import com.revature.questions.extras.Question18Subclass;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;

public class Question18Test {

    private Question18Subclass question18 = new Question18Subclass();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        Question18Subclass question18 = new Question18Subclass();
    }

    @After
    public void teardown() {
        question18 = null;
    }

    @Test
    public void testCaseCheckUppercase() {
        String s = "Fast";
        ByteArrayInputStream sysIn = new ByteArrayInputStream(s.getBytes());
        System.setIn(sysIn);

        boolean result = (question18.checkUppercase());
        Assert.assertEquals(true, result);
    }

    @Test
    public void testCaseCheckUppercaseNumber() {
        boolean expected_ = false;
        String s = "1000";
        ByteArrayInputStream sysIn = new ByteArrayInputStream(s.getBytes());
        System.setIn(sysIn);

        boolean result = question18.checkUppercase();
        Assert.assertEquals(expected_, result);
    }

    @Test
    public void testCaseStringToInt1000() {
        int expected_ = 1000;
        String s = "1000";
        ByteArrayInputStream sysIn = new ByteArrayInputStream(s.getBytes());
        System.setIn(sysIn);

        int result = (question18.convertStringToInt());
        Assert.assertEquals(expected_, result);
    }

    @Test(expected = NumberFormatException.class)
    public void testCaseStringToIntDouble() {

        String s = "10.00";
        ByteArrayInputStream sysIn = new ByteArrayInputStream(s.getBytes());
        System.setIn(sysIn);

        question18.convertStringToInt();
    }

    @Test
    public void testCaseConvertToLowercase() {
        String expected = "ten";

        String s = "TEN";
        ByteArrayInputStream sysIn = new ByteArrayInputStream(s.getBytes());
        System.setIn(sysIn);

        String actual = question18.convertToLowercase();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCaseConvertToLowercaseNumbers() {
        String expected = "1000";

        String s = "1000";
        ByteArrayInputStream sysIn = new ByteArrayInputStream(s.getBytes());
        System.setIn(sysIn);

        String actual = question18.convertToLowercase();
        Assert.assertEquals(expected, actual);
    }


}

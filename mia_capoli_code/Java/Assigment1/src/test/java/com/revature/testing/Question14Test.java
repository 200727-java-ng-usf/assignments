package com.revature.testing;

import com.revature.questions.Question13;
import com.revature.questions.Question14;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.time.LocalDate;
import java.util.Arrays;

public class Question14Test {

    private Question14 question14 = new Question14();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        Question13 question13 = new Question13();
    }

    @Test
    public void testcase1() {
        double expected = Math.sqrt(8);
        String expected_ = String.valueOf(expected);
        String actual = question14.switchCase(1);
        Assert.assertEquals(expected_, actual);
    }

    @Test
    public void testCase2() {
        String expected = LocalDate.now().toString();
        String actual = question14.switchCase(2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCase3() {
        String[] expected = {"I", "am", "learning", "Core", "Java"};
        String expected_ = Arrays.toString(expected);
        String actual = question14.switchCase(3);
        Assert.assertEquals(expected_, actual);
    }
    @Test
    public void testCaseOther() {
        String expected_ = "";
        String actual = question14.switchCase(5);
        Assert.assertEquals(expected_, actual);
    }
}

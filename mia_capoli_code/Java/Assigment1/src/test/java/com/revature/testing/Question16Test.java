package com.revature.testing;


import com.revature.questions.Question16;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Question16Test {


    private Question16 question16 = new Question16();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        Question16 question13 = new Question16();
    }

    @Test
    public void testStringPrincess() {
        int expected = 8;
        String[] mainString = new String[]{"Princess"};
        int actual = question16.main(mainString);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStringMultipleArgs() {
        int expected = 12;
        String[] mainString = new String[]{"Princess", "King"};
        int actual = question16.main(mainString);
        Assert.assertEquals(expected, actual);
    }

}

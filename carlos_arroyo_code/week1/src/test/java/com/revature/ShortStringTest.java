package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ShortStringTest {

    private ShortString sut;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setUp() {sut = new ShortString();}

    @After
    public void tearDown() {sut = null; }

    @Test
    public void testShortString() {
        String str = "I like to sleep.";
        sut.subString(str, 0, 1);
    }

    @Test
    public void testShortStringNull() {

    }
}

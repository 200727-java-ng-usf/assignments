package com.revature.coreJavaAssign;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class q18InheritsTest {
    private q18Inherits sut;
    String thisString ="";

    @Before
    public void setUp() {
        sut = new q18Inherits(thisString);
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void testWow(){

        String expected = "WoW";
        String sqre = "WoW";
        InputStream inContent = new ByteArrayInputStream(sqre.getBytes());
        System.setIn(inContent);
        Assert.assertEquals(expected,sut.userToInt());

    }

}
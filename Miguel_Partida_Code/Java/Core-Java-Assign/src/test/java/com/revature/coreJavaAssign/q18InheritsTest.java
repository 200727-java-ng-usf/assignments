package com.revature.coreJavaAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

    }

}
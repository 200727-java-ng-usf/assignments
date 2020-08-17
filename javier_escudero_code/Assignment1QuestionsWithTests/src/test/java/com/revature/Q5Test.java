package com.revature;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Q5Test{

    //public Q5 q5;
    public String  wholeString;

    @Before
    public void T1SetUp(){
       // q5 = new Q5();
        wholeString = "testing a substring";
    }

    @Test
    public void testGivenString(){
        String expectedString = "testing";
        assertEquals(expectedString, Q5.substring(wholeString, 7));
    }

}

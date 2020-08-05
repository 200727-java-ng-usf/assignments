package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T3StringReversal {
    Q3StringReversal q3;
    String str;

    @Before
    public void t3setupTest() {
        q3 = new Q3StringReversal();
        str = "ReverseMe";
        System.out.println();
    }

    @After
    public void t3tearDownTest(){
        System.out.println();
    }

    //region UTILITYTESTS
    @Test
    public void t3StringReversalNotNull(){
//        Collections.shuffle(bubbles);
        assertNotNull(q3);
    }
    //endregion

    //region POSITIVE
    @Test
    public void t3ReverseStringReversed()
    {
//        str = q3.reverseBuild(str);
        str = q3.reverseString(str);
        System.out.print(str);
        assertEquals("eMesreveR", str);
    }
    //endregion

    //region NEGATIVE
    @Test
    public void t3ReverseStringForwardCheck()
    {
//        str = q3.reverseBuild(str);
        str = q3.reverseString(str);
        System.out.print(str);
        assertNotEquals("ReverseMe", str);
    }
    //endregion

}

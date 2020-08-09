package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T3StringReversal {
    Q3StringReversal q3;
    String str;

    @Before
    public void t3Setup() {
        q3 = new Q3StringReversal();
        str = "ReverseMe";

    }

    @After
    public void t3TearDown(){
        q3 = null;
    }

    //region UTILITYTESTS
    @Test
    public void t3NotNull(){
//        Collections.shuffle(bubbles);
        assertNotNull(q3);
    }
    //endregion

    //region POSITIVE_TESTS
    @Test
    public void t3ReverseStringReversed()
    {
//        str = q3.reverseBuild(str);
        str = q3.reverseBuild(str);
        System.out.print(str);
        assertEquals("eMesreveR", str);
    }
    @Test
    public void t3ReverseStringForwardCheck()
    {
//        str = q3.reverseBuild(str);
        str = q3.reverseBuild(str);
        System.out.print(str);
        assertNotEquals("ReverseMe", str);
    }
    @Test
    public void t3ReverseStringReverseCheck()
    {
//        str = q3.reverseBuild(str);
        str = q3.reverseBuild("eMesreveR");
        System.out.print(str);
        assertEquals("ReverseMe", str);
    }
    //endregion

    //region NEGATIVE_TESTS
    @Test
    public void t3ReverseStringEmpty()
    {
//        str = q3.reverseBuild(str);
        str = q3.reverseBuild("");
        System.out.print(str);
        assertEquals("", str);
    }
    //endregion

}

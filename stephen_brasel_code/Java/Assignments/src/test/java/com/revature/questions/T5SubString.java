package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Random;

import static java.time.LocalDateTime.now;
import static org.junit.Assert.*;

public class T5SubString {
    Q5SubString q5;
    int index = 3;

    @Before
    public void t1setupTest() {
        q5 = new Q5SubString();
        System.out.println();
    }

    @After
    public void t1tearDownTest(){
        System.out.println();
    }

    //region UTILITYTESTS
    @Test
    public void t1BubbleSortNotNull(){
//        Collections.shuffle(bubbles);
        assertNotNull(q5);
    }
    //endregion

    //region POSITIVE
    @Test
    public void t5SubString(){
        int index = 3;
        String str = "Revature";
        String ret = q5.substr(str, index);
        assertEquals("Rev", ret);
        System.out.println(str + " substring " + index + ": " + ret);
    }

    //endregion

    //region NEGATIVE
    @Test(expected = IndexOutOfBoundsException.class)
    public void t5SubStringException() throws IndexOutOfBoundsException{
        int index = 3;
        String str = "R";
        String ret = q5.substr(str, index);
        System.out.println(str + " substring " + index + ": " + ret);
    }
    //endregion

}

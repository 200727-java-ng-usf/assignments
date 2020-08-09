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
    public void t1Setup() {
        q5 = new Q5SubString();
    }

    @After
    public void t1TearDown(){
        q5 = null;
    }

    //region UTILITYTESTS
    @Test
    public void t1NotNull(){
//        Collections.shuffle(bubbles);
        assertNotNull(q5);
    }
    //endregion

    //region POSITIVE_TESTS
    @Test
    public void t5SubString(){
        int index = 3;
        String str = "Revature";
        String ret = q5.substr(str, index);
        assertEquals("Rev", ret);
        System.out.println(str + " substring " + index + ": " + ret);
    }

    //endregion

    //region NEGATIVE_TESTS
    @Test
    public void t5SubStringLargerIndexThanString() {
        int index = 3;
        String str = "R";
        String ret = q5.substr(str, index);
        assertEquals("R", ret);
        System.out.println(str + " substring " + index + ": " + ret);
    }
    @Test
    public void t5SubStringNegativeIndex() {
        int index = -1;
        String str = "R";
        String ret = q5.substr(str, index);
        assertEquals("", ret);
        System.out.println(str + " substring " + index + ": " + ret);
    }
    @Test
    public void t5SubStringZeroIndex() {
        int index = -1;
        String str = "R";
        String ret = q5.substr(str, index);
        assertEquals("", ret);
        System.out.println(str + " substring " + index + ": " + ret);
    }
    //endregion

}

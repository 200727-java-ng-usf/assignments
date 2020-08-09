package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.ZoneOffset;
import java.util.Random;

import static java.time.LocalDateTime.now;
import static org.junit.Assert.*;

public class T10Ternary {
    Q10Ternary q10;
    Random rand;

    @Before
    public void t10Setup() {
        q10 = new Q10Ternary();
        rand = new Random();
        rand.setSeed(now().toEpochSecond(ZoneOffset.UTC));

    }

    @After
    public void t10TearDown(){
        q10 = null;
    }

    //region UTILITYTESTS
    @Test
    public void t10NotNull(){
        assertNotNull(q10);
    }
    //endregion

    //region POSITIVE_TESTS
    @Test
    public void t10Ternary(){
        int x = rand.nextInt();
        int y = rand.nextInt();
        int result;
        System.out.println(x + " " + y + ": " + q10.lesser(x, y));
        if(x < y) result = x;
        else result = y;
        assertEquals(result, q10.lesser(x, y));
    }
    @Test
    public void t10TernaryEqual(){
        int x = rand.nextInt();
        int y = x;
        int result;
        System.out.println(x + " " + y + ": " + q10.lesser(x, y));
        if(x < y) result = x;
        else result = y;
        assertEquals(result, q10.lesser(x, y));
    }
    //endregion

    //region NEGATIVE_TESTS
    @Test
    public void t10TernaryMax(){
        int x = Integer.MAX_VALUE;
        int y = x;
        System.out.println(x + " " + y + ": " + q10.lesser(x, y));
        assertEquals(x, q10.lesser(x, y));
    }
    @Test
    public void t10TernaryMin(){
        int x = Integer.MAX_VALUE;
        int y = x;
        System.out.println(x + " " + y + ": " + q10.lesser(x, y));
        assertEquals(x, q10.lesser(x, y));
    }
    @Test
    public void t10TernaryMinMax(){
        int x = Integer.MIN_VALUE;
        int y = Integer.MAX_VALUE;
        System.out.println(x + " " + y + ": " + q10.lesser(x, y));
        assertEquals(x, q10.lesser(x, y));
    }
    @Test
    public void t10TernaryMaxMin(){
        int x = Integer.MAX_VALUE;
        int y = Integer.MIN_VALUE;
        System.out.println(x + " " + y + ": " + q10.lesser(x, y));
        assertEquals(y, q10.lesser(x, y));
    }

    //endregion

}

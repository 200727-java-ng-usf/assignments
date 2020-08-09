package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.ZoneOffset;
import java.util.Random;

import static java.time.LocalDateTime.now;
import static org.junit.Assert.*;

public class T6EvenInt {
    Q6EvenInt q6;
    String str;
    Random rand;
    int x;

    @Before
    public void t6Setup() {
        rand = new Random();
        rand.setSeed(now().toEpochSecond(ZoneOffset.UTC));
        x = rand.nextInt();
        q6 = new Q6EvenInt();
        str = "ReverseMe";

    }

    @After
    public void t6TearDown(){
        q6 = null;
    }

    //region UTILITYTESTS
    @Test
    public void t6NotNull(){
//        Collections.shuffle(bubbles);
        assertNotNull(q6);
    }
    //endregion

    //region POSITIVE_TESTS

    @Test
    public void t6EvenInt(){
        System.out.println(x + ": " + q6.isEven(x));
        assertEquals((x%2==0), q6.isEven(x));
    }
    @Test
    public void t6OddInt(){
        System.out.println(x + ": " + q6.isEven(x));
        assertNotEquals(((x+1)%2==0), q6.isEven(x));
    }
    //endregion

    //region NEGATIVE_TESTS
    @Test
    public void t6ZeroInt(){
        x = 0;
        System.out.println(x + ": " + q6.isEven(x));
        assertEquals(((x)%2==0), q6.isEven(x));
    }
    @Test
    public void t6MaxInt(){
        x = Integer.MAX_VALUE;
        System.out.println(x + ": " + q6.isEven(x));
        assertEquals(((x)%2==0), q6.isEven(x));
    }
    @Test
    public void t6MinInt(){
        x = Integer.MIN_VALUE;
        System.out.println(x + ": " + q6.isEven(x));
        assertEquals(((x)%2==0), q6.isEven(x));
    }
    //endregion

}

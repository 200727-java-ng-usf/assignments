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
    public void t6setupTest() {
        rand = new Random();
        rand.setSeed(now().toEpochSecond(ZoneOffset.UTC));
        x = rand.nextInt();
        q6 = new Q6EvenInt();
        str = "ReverseMe";
        System.out.println();
    }

    @After
    public void t6tearDownTest(){
        System.out.println();
    }

    //region UTILITYTESTS
    @Test
    public void t6EvenIntNotNull(){
//        Collections.shuffle(bubbles);
        assertNotNull(q6);
    }
    //endregion

    //region POSITIVE

    @Test
    public void t6EvenInt(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": " + q6.isEven(i));
        }
        System.out.println(x + ": " + q6.isEven(x));
        assertEquals((x%2==0), q6.isEven(x));
    }
    //endregion

    //region NEGATIVE

    @Test
    public void t6OddInt(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": " + q6.isEven(i));
        }
        System.out.println(x + ": " + q6.isEven(x));
        assertNotEquals(((x+1)%2==0), q6.isEven(x));
    }
    //endregion

}

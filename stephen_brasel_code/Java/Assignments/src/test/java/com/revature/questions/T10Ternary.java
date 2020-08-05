package com.revature.questions;

import com.revature.testHelpers.Employee;
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
    public void t10setupTest() {
        q10 = new Q10Ternary();
        rand = new Random();
        rand.setSeed(now().toEpochSecond(ZoneOffset.UTC));
        System.out.println();
    }

    @After
    public void t10tearDownTest(){
        System.out.println();
    }

    //region UTILITYTESTS
    @Test
    public void t10TernaryNotNull(){
        assertNotNull(q10);
    }
    //endregion

    //region POSITIVE
    @Test
    public void t10Ternary(){
        int x = rand.nextInt();
        int y = rand.nextInt();
        System.out.println(x + " " + y + ": " + q10.lesser(x, y));
        assertEquals((x < y ? x : y), q10.lesser(x, y));
    }
    @Test
    public void t10TernaryEqual(){
        int x = rand.nextInt();
        int y = x;
        System.out.println(x + " " + y + ": " + q10.lesser(x, y));
        assertEquals((x < y ? x : y), q10.lesser(x, y));
    }
    //endregion

    //region NEGATIVE

    //endregion

}

package com.revature.questions;

import com.revature.util.FloatPoints;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.ZoneOffset;
import java.util.Random;

import static java.time.LocalDateTime.now;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class T11PackageAccess {
    Q11PackageAccess q11;
    Random rand;

    @Before
    public void t11setupTest() {
        q11 = new Q11PackageAccess();
        rand = new Random();
        rand.setSeed(now().toEpochSecond(ZoneOffset.UTC));
        System.out.println();
    }

    @After
    public void t11tearDownTest(){
        System.out.println();
    }

    //region UTILITYTESTS
    @Test
    public void t11PackageAccessNotNull(){
        assertNotNull(q11);
    }
    //endregion

    //region POSITIVE
    @Test
    public void t11PackageAccessX(){
//        q11
        float x = rand.nextFloat();
        float y = rand.nextFloat();
        FloatPoints fp = new FloatPoints(x, y);
        q11.printFloats(fp);
        assertEquals(x, q11.getA(), 0.001F);
    }

    @Test
    public void t11PackageAccessY(){
//        q11
        float x = rand.nextFloat();
        float y = rand.nextFloat();
        FloatPoints fp = new FloatPoints(x, y);
        q11.printFloats(fp);
        assertEquals(y, q11.getB(), 0.001F);
    }
    //endregion

    //region NEGATIVE
    public void t11PackageAccessNegative(){

    }

    //endregion

}

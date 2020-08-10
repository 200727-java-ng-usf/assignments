package com.revature.questions;

import com.revature.util.FloatPoints;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZoneOffset;
import java.util.Random;

import static java.time.LocalDateTime.now;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

public class T11PackageAccess {
    Q11PackageAccess q11;
    Random rand;

    @Before
    public void t11Setup() {
        q11 = new Q11PackageAccess();
        rand = new Random();
        rand.setSeed(now().toEpochSecond(ZoneOffset.UTC));

    }

    @After
    public void t11TearDown(){
        q11 = null;
    }

    //region UTILITYTESTS
    @Test
    public void t11NotNull(){
        assertNotNull(q11);
    }
    //endregion

    //region POSITIVE_TESTS
    @Test
    public void t11PackageAccessMockX(){
//        q11
        float x = rand.nextFloat();
        float y = rand.nextFloat();
        FloatPoints fp = Mockito.mock(FloatPoints.class);
        when(fp.getX()).thenReturn(x);
        when(fp.getY()).thenReturn(y);
        q11.printFloats(fp);
        assertEquals(x, q11.getA(), 0.001F);
        verify(fp, times(2)).getX();
    }
    @Test
    public void t11PackageAccessMockY(){
//        q11
        float x = rand.nextFloat();
        float y = rand.nextFloat();
        FloatPoints fp = Mockito.mock(FloatPoints.class);
        when(fp.getX()).thenReturn(x);
        when(fp.getY()).thenReturn(y);
        q11.printFloats(fp);
        assertEquals(y, q11.getB(), 0.001F);
        verify(fp, times(2)).getY();
    }
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

    //region NEGATIVE_TESTS
    @Test
    public void t11PackageAccessCastedDoublesX(){
        double x = rand.nextDouble();
        double y = rand.nextDouble();
        FloatPoints fp = new FloatPoints((float)x, (float)y);
        q11.printFloats(fp);
        assertEquals(x, q11.getA(), 0.001F);
    }
    @Test
    public void t11PackageAccessCastedDoublesY(){
        double x = rand.nextDouble();
        double y = rand.nextDouble();
        FloatPoints fp = new FloatPoints((float)x, (float)y);
        q11.printFloats(fp);
        assertEquals(y, q11.getB(), 0.001F);
    }
    @Test
    public void t11PackageAccessMax(){
        float x = Float.MAX_VALUE;
        float y = Float.MAX_VALUE;
        FloatPoints fp = new FloatPoints((float)x, (float)y);
        q11.printFloats(fp);
        assertEquals(y, q11.getB(), 0.001F);
    }
    @Test
    public void t11PackageAccessMin(){
        float x = Float.MIN_VALUE;
        float y = Float.MIN_VALUE;
        FloatPoints fp = new FloatPoints((float)x, (float)y);
        q11.printFloats(fp);
        assertEquals(y, q11.getB(), 0.001F);
    }

    //endregion

}

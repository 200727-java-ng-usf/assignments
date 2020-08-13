package com.revature.coreJavaAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class q17intrestTest {
    private q17intrest sut;

    @Before
    public void setUp(){
        sut  = new q17intrest();
    }

    @After
    public void tearDown(){
        sut = null;
    }

    @Test
    public void q17interest() {
        {
            double expected =1.0;

            String ROI = "1\n1\n1 ";
            InputStream inContent = new ByteArrayInputStream(ROI.getBytes());
            System.setIn(inContent);
            assertEquals(expected, java.util.Optional.of(sut.q17interest()));

        }
//        double principal =0;
//        double rateOfInterest = 0;
//        double numberOfYears = 0;
//        double expected = 1;
//        assertEquals(java.util.Optional.of(expected),sut.q17interest(rateOfInterest,principal,numberOfYears));

    }
}
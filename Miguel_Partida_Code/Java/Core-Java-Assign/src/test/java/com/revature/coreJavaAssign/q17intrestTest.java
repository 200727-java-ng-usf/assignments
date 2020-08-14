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

            double expected =8.0;
            double delta = 8;

            String ROI = "2\n2\n2 ";
            InputStream inContent = new ByteArrayInputStream(ROI.getBytes());
            System.setIn(inContent);
            assertEquals(expected, sut.q17interest(),delta);

        }

        @Test
    public void interestOf0(){
        double expected = 0;
        double delta = 0;
        String ROI = "0\n0\n0";
        InputStream inContent = new ByteArrayInputStream(ROI.getBytes());
        System.setIn(inContent);
        assertEquals(expected,sut.q17interest(),delta);
        }

    }

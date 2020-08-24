package com.revature;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q15Test{

    private Q15 q15;
    @Before
    public void setup(){
        q15 = new Q15();
    }

    @Test
    public void additionTest(){
        double three = 3.0;
        assertEquals(three, q15.additionMethod(1,2),0);
    }

    @Test
    public void subtractionTest(){
        double one = 1.0;
       assertEquals(one, q15.subtractionMethod(3,2), 0);
    }

    @Test
    public void multiplicationTest(){
        double eighteen = 18.0;
        assertEquals(eighteen,q15.multiplicationMethod(3,6),0);
    }

    @Test
    public void division(){
        double two = 2.0;
        assertEquals(two, q15.divisionMethod(30,15), 0);
    }
}



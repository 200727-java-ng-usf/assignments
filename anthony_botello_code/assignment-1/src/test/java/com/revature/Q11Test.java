package com.revature;

import static org.junit.Assert.assertTrue;

import com.revature.q11.e.Euler;
import com.revature.q11.pi.Pi;

import org.junit.Test;

public class Q11Test {
    
    @Test // test that Q11 can access float from Pi class
    public void testIfReturnsPi(){

        float expected = Pi.pi;
        float result = Q11.getFloatFromPiClass();
        
        assertTrue(expected == result);
    }

    @Test // test that Q11 can access float from Euler class
    public void testIfReturnsE(){

        float expected = Euler.e;
        float result = Q11.getFloatFromEulerClass();

        assertTrue(expected == result);
    }
}
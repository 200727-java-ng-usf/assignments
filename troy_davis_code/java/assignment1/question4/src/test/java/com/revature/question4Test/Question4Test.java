/*
     Q4. Write a program to compute N factorial.
 */
package com.revature.question4Test;

import com.revature.question4.Question4;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Question4Test {
    Question4 q;
    Question4 q2;
    Question4 q3;
    @Before
    public void setup(){
        q = new Question4(10);
        q2 = new Question4(7);
        q3 = new Question4(null);
    }
    @After
    public void tearDown(){
        q = null;
        q2 = null;
        q3 = null;
    }

    @Test
    public void notNullTest(){
        String msg = "When instantiated, the fileds should not be null";
        Assert.assertNotNull(q.getFactorialtoReturn());
        Assert.assertNotNull(q.getNumberToFactor());
    }
    @Test
    public void proofTest(){
        String msg = "will the method return a number that matches known factorials";
        double q1Proof = 3628800;
        Assert.assertTrue(msg,q.getFactorialtoReturn() == q1Proof);
        double q2Proof = 5040;
        Assert.assertTrue(msg,q2.getFactorialtoReturn() == q2Proof);
    }
    @Test
    public void nullTest(){
        String msg = "If given a null value, the method should return 0;";
        Assert.assertTrue(msg,q3.getFactorialtoReturn() == 0);
    }
}

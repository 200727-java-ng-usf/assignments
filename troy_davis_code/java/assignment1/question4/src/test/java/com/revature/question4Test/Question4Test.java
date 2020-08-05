package com.revature.question4Test;

import com.revature.question4.Question4;
import org.junit.Assert;
import org.junit.Test;

public class Question4Test {
    Question4 q = new Question4(10);
    double q1Proof = 3628800;
    Question4 q2 = new Question4(7);
    double q2Proof = 120;
    @Test
    public void notNullTest(){
        Assert.assertNotNull(q.getFactorialtoReturn());
        Assert.assertNotNull(q.getNumberToFactor());
    }
    @Test
    public void proofTest(){
        //will the method return a number that matches known factorials
        System.out.println(q);
        Assert.assertTrue(q.getFactorialtoReturn() == q1Proof);
        System.out.println(q2);
        //Assert.assertTrue(q2.getFactorialtoReturn() == q2Proof);
    }
}

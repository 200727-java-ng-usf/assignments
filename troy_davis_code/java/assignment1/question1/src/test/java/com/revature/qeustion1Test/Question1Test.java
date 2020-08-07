/*
    Q1. Perform a bubble sort on the following integer array:
        - 1,0,5,6,3,2,3,7,9,8,4
 */
package com.revature.qeustion1Test;

import com.revature.question1.Question1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Question1Test {
    int[] test;
    int[] testProof;
    Question1 q;

    @Before
    public void setup(){
        test = new int[]{1,0,5,6,3,2,7,9,8,4};
        testProof = new int[]{0,1,2,3,4,5,6,7,8,9};
        q = new Question1(test);
        System.out.println(q);
    }
    @Test
    public void notNullTest(){
        //test to make sure that the fields are not null
        Assert.assertNotNull(q.getSortedArray());
    }
    @Test
    public void proofTest(){
        //does the class return an int-array that matches a sorted proof array?
        Assert.assertArrayEquals(test,q.getSortedArray());
    }


}

/*
    Q1. Perform a bubble sort on the following integer array:
        - 1,0,5,6,3,2,3,7,9,8,4
 */
package com.revature.qeustion1Test;

import com.revature.question1.Question1;
import org.junit.Assert;
import org.junit.Test;

public class Question1Test {
    int[] test = {1,0,5,6,3,2,7,9,8,4};
    Question1 q = new Question1(test);

    @Test
    public void notNullTest(){
        //test to make sure that the fields are not null
        System.out.println(q.toString());
        Assert.assertTrue(q.getGivenArray() != null);
        Assert.assertTrue(q.getSortedArray() != null);
    }
}

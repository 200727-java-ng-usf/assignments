package com.revature.question19Tests;

import com.revature.question19.Question19;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class Question19Tests {
    Question19 sut;
    String msg;
    ArrayList<Integer> expectedReturn;

    @After
    public void tearDown(){
        expectedReturn = null;
        sut = null;
    }

    @Test
    public void remainingAfterPrimeRemovalTests(){
        msg = "after the array has been manipulated, only non prime numbers should remain";
        expectedReturn = new ArrayList<>();
        expectedReturn.add(4);
        expectedReturn.add(6);
        expectedReturn.add(8);
        expectedReturn.add(9);
        sut = new Question19();
        Assert.assertEquals(expectedReturn,sut.getArrayList());
    }
}

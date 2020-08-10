package com.revature;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class Q12Test {
    Q12 showTest;
    int[] number;
    ArrayList<Integer> result;

    @Before
    public void setShowTest(){
        this.showTest = new Q12();
        number = new int[]{1, 2, 3, 4};
        result= new ArrayList<>();
        result.add(2);
        result.add(4);
    }
    @After
    public void cutShowTest(){
        this.showTest = null;
        this.number =null;
        result = null;
    }

    @Test
    public void printEven() {
        Assert.assertNotNull(showTest.printEven(number));
        Assert.assertEquals(result,showTest.printEven(number));




    }
}
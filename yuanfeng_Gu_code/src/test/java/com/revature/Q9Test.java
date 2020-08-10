package com.revature;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class Q9Test {
    Q9 showTest;
    ArrayList<Integer> primeNum;
    ArrayList<Integer> result = new ArrayList<Integer>();

    @Before
    public void setShowTest(){
        this.showTest = new Q9();
        this.primeNum = new ArrayList<Integer>();
    }
    @After
    public void cutShowTest(){
        this.showTest = null;
    }
    @Test
    public void printPrime() {

        primeNum.add(2);
        primeNum.add(3);
        result.add(2);
        Assert.assertNotNull(showTest.printPrime(primeNum));
        Assert.assertEquals(result,showTest.printPrime(primeNum));

    }
}
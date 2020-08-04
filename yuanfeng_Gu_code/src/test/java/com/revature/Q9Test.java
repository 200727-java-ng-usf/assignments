package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class Q9Test {
    Q9 showTest;
    ArrayList<Integer> primeNum;

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
       showTest.printPrime(primeNum);
    }
}
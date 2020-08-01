package com.revature;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Q9Test {
    Q9 showTest = new Q9();
    @Test
    public void printPrime() {

        ArrayList<Integer> primeNum = new ArrayList<Integer>();

        primeNum.add(2);
        primeNum.add(3);

       showTest.printPrime(primeNum);
    }
}
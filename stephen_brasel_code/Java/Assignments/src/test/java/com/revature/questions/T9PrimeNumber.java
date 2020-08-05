package com.revature.questions;

import com.revature.testHelpers.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T9PrimeNumber {
    Q9PrimeNumber q9;
    Integer[] primesToHundred = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

    @Before
    public void t9setupTest() {
        q9 = new Q9PrimeNumber();
        System.out.println();
    }

    @After
    public void t9tearDownTest(){
        System.out.println();
    }

    //region UTILITYTESTS
    @Test
    public void t9PrimeNumberNotNull(){
        assertNotNull(q9);
    }
    //endregion

    //region POSITIVE
    @Test
    public void t9PrimeNumber(){
        q9.printPrimes();
        assertArrayEquals(primesToHundred, q9.getPrimesToHundred().toArray());
    }
    //endregion

    //region NEGATIVE

    //endregion

}

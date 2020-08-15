package com.revature.coreJavaAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class q7SortEmployeesTest {

    private q7SortEmployees sut;




    @Before
    public void setUp()  {
        sut = new q7SortEmployees();
    }

    @After
    public void tearDown() {
        sut = null;
    }




    @Test
    public void compareDBZ() {
        q7SortEmployees emp2 = new q7SortEmployees("Vegeta","Customer-Service",24);
        q7SortEmployees emp3 = new q7SortEmployees("freza","HR",600);
        int expected = sut.compare(emp2,emp3);
        assertTrue(expected >= -1);
    }

    @Test
    public void compareJackFSF() {
        q7SortEmployees jFSF1 = new q7SortEmployees("Jake", "Customer-Service", 34);
        q7SortEmployees jFSF2 = new q7SortEmployees("Jake","Customer-Service",28);
        int expected = sut.compare(jFSF1,jFSF2);
        assertTrue(expected <= 1);
    }
}
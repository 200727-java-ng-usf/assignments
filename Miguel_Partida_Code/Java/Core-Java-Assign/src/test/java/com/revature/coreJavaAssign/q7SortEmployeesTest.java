package com.revature.coreJavaAssign;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class q7SortEmployeesTest {

    private q7SortEmployees sut;

    q7SortEmployees emp1 = new q7SortEmployees("Goku","Marketing",25);
    q7SortEmployees emp2 = new q7SortEmployees("Vegeta","Customer-Service",24);

    ArrayList<q7SortEmployees> employees = new ArrayList<>();


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testq7(){

    }
}
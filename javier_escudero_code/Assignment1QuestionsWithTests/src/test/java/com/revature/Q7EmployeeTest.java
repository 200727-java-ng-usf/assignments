package com.revature;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class Q7EmployeeTest {

    public Q7Employee q7;
    ArrayList<Q7Employee> employeesList = new ArrayList<>();

    @Before
    public void T1SetUp(){
        //ArrayList<Q7Employee> employeesList = new ArrayList<>();
        employeesList.add(new Q7Employee( "Y", 55, "R"));
        employeesList.add(new Q7Employee( "Z", 44, "M"));
        employeesList.add(new Q7Employee( "A", 33, "A"));

        System.out.println("employeeList before Sorting");
        for (int employee = 0; employee < employeesList.size(); employee++)
            System.out.println(employeesList.get(employee));

    }

    @Test
    public void testByName(){
        ArrayList<Q7Employee> expected = new ArrayList<>();
        expected.add(new Q7Employee( "A", 33, "A"));
        expected.add(new Q7Employee( "Y", 55, "R"));
        expected.add(new Q7Employee( "Z", 44, "M"));


        System.out.println("\nSorted employeeList by name: ");
        Collections.sort(employeesList, new SortByName());
        for (int i = 0; i < employeesList.size(); i++)
            System.out.println(employeesList.get(i));

        System.out.println("\nCompare to '/expected'/ array list by name: ");
        for (int i = 0; i < expected.size(); i++)
            System.out.println(expected.get(i));

       // assertEquals(expected, employeesList);
    }
}
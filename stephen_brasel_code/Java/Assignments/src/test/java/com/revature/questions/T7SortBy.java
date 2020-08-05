package com.revature.questions;

import com.revature.testHelpers.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T7SortBy {
    Q7SortBy q7;
    Employee[] people;
    int index;

    @Before
    public void t7setupTest() {
        q7 = new Q7SortBy();
        index = 2;
        people = new Employee[index];
        System.out.println();
    }

    @After
    public void t7tearDownTest(){
        System.out.println();
    }

    //region UTILITYTESTS
    @Test
    public void t7SortByNotNull(){
        assertNotNull(q7);
    }
    //endregion

    //region POSITIVE

    @Test
    public void t7SortBy(){
        people[0] = new Employee("Jim", "Parks", "DEV", 32);
        people[1] = new Employee("Timothy", "Parker", "DEV", 30);
        q7.EmployeeSort(people);
        System.out.println(people[0]);
        System.out.println(people[1]);
        assertArrayEquals(new Object[]{
                        new Employee("Jim", "Parks", "DEV", 32),
                        new Employee("Timothy", "Parker", "DEV", 30)},
                people);
    }

    @Test
    public void t7SortBySorted(){
        people[0] = new Employee("Timothy", "Parker", "DEV", 30);
        people[1] = new Employee("Jim", "Parks", "DEV", 32);
        q7.EmployeeSort(people);
        System.out.println(people[0]);
        System.out.println(people[1]);
        assertArrayEquals(new Object[]{
                        new Employee("Jim", "Parks", "DEV", 32),
                        new Employee("Timothy", "Parker", "DEV", 30)},
                people);
    }
    //endregion

    //region NEGATIVE

    //endregion

}

package com.revature;

import static org.junit.Assert.assertTrue;

import java.util.Comparator;

import com.revature.Q7.Employee;

import org.junit.Test;

public class Q7Test {

    private Employee anthony = new Employee("Anthony Botello", "Physics", 28);
    private Employee hank = new Employee("Hank Hill", "Propane & Propane Accessories", 45);

    // utility function that takes employee comparator as input
    // used to avoid repetition of 'assertTrue' in every test
    private void testEmployeeComparator(Comparator<Employee> comparator){

        assertTrue(comparator.compare(anthony, hank) < 0);
        assertTrue(comparator.compare(hank, anthony) > 0);
        assertTrue(comparator.compare(anthony, anthony) == 0);
    }

    @Test // test name comparator
    public void testCompareByName(){

        testEmployeeComparator(Employee.compareByName);
    }

    @Test // test department comparator
    public void testCompareByDepartment(){

        testEmployeeComparator(Employee.compareByDepartment);
    }

    @Test // test age comparator
    public void testCompareByAge(){
        testEmployeeComparator(Employee.compareByAge);
    }
}
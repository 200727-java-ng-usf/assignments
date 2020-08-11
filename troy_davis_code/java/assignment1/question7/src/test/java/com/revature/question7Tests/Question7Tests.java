/**
 * Q7. Sort two employees based on their:
 *     - name,
 *     - department,
 *     - and age
 *     - using the Comparator interface.
 */
package com.revature.question7Tests;

import com.revature.question7.models.Question7EmployeeModel;
import com.revature.question7.util.Question7Comparator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Question7Tests {
    Question7EmployeeModel employee1;
    Question7EmployeeModel employee2;
    Question7EmployeeModel employee3;
    Question7EmployeeModel employee4;
    Question7EmployeeModel employee5;
    Question7EmployeeModel employee6;
    Question7EmployeeModel employee7;
    Question7EmployeeModel employee8;
    Question7Comparator employeeComparator;
    int expectedReturn;
    @Before
    public void setup(){
        //setup the employee array before each test
        employee1 = new Question7EmployeeModel("Tom", "Management", 25);
        employee2 = null;
        employee3 = new Question7EmployeeModel("Bob", "Kitchen", 20);
        employee4 = new Question7EmployeeModel("Eric", "Kitchen", 20);
        employee5 = new Question7EmployeeModel("Timmy", "Management", 30);
        employee6 = new Question7EmployeeModel("Timmy", "Management", 40);
        employee7 = new Question7EmployeeModel("Tom", "Kitchen", 25);
        employee8 = null;
        expectedReturn = 0;
        employeeComparator = new Question7Comparator();
    }
    @After
    public void tearDown(){
        employee1 = null;
        employee2 = null;
        employee3 = null;
        employee4 = null;
        employee5 = null;
        employee6 = null;
        employee7 = null;
        employee8 = null;
        expectedReturn = 0;
        employeeComparator = null;
    }
    @Test
    public void nullEqualTest(){
        String msg = "when given two employees with null values, the method should return 0";
        expectedReturn = 0;
        Assert.assertTrue(msg, employeeComparator.compare(employee2, employee8) == expectedReturn);
    }
    @Test
    public void sortByNameTest(){
        String msg = "Given employees with the same age and department, the method should return -1 based on Names: 'Bob' < 'Eric";
        expectedReturn = -1;
        Assert.assertTrue(msg, employeeComparator.compare(employee3, employee4) == expectedReturn);
    }
    @Test
    public void sortByAgeTest(){
        String msg = "Given employees with the same name and department, the method should return 1 based on Age: 30 < 40";
        expectedReturn = -1;
        Assert.assertTrue(msg, employeeComparator.compare(employee5, employee6) == expectedReturn);
    }
    @Test
    public void sortByDepartmentTest(){
        String msg = "Given employees with the same name and age, the method should return 1 based on Department: Management > Kitchen";
        expectedReturn = 1;
        Assert.assertTrue(msg, employeeComparator.compare(employee1, employee7) == expectedReturn);
    }
}

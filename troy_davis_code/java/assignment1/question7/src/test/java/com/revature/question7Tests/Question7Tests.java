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
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class Question7Tests {
    Question7EmployeeModel employee1;
    Question7EmployeeModel employee2;
    Question7EmployeeModel employee3;
    Question7EmployeeModel employee4;
    Question7EmployeeModel employee5;
    Question7EmployeeModel employee6;
    Question7EmployeeModel employee7;
    Question7EmployeeModel employee8;
    ArrayList<Question7EmployeeModel> employeeList;
    Question7Comparator employeeComparator;

    @Before
    public void setup(){
        //setup the employee array before each test
        employee1 = new Question7EmployeeModel("Tom", "Management", 25);
        employee2 = new Question7EmployeeModel("John", "Management", 35);
        employee3 = new Question7EmployeeModel("Bob", "Kitchen", 20);
        employee4 = new Question7EmployeeModel("Eric", "Kitchen", 20);
        employee5 = new Question7EmployeeModel("Timmy", "Management", 30);
        employee6 = new Question7EmployeeModel("Jimmy", "Management", 30);
        employee7 = new Question7EmployeeModel("Tom", "Kitchen", 25);
        employee8 = new Question7EmployeeModel("John", "Kitchen", 35);
        employeeList = new ArrayList<>();

        employeeComparator = new Question7Comparator();
    }
    @Test
    public void notNullTest(){
        //test that when given employees, the return is not Null
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        employeeList.add(employee8);
        employeeList.sort(employeeComparator);
        Assert.assertNotNull(employeeList);
    }
    @Test
    public void sortByNameTest(){
        //can the comparator sort employees by name?

    }
    @Test
    public void sortByAgeTest(){
        //can the comparator sort employees by name?

    }
    @Test
    public void sortByDepartmentTest(){
        //can the comparator sort employees by name?

    }
}

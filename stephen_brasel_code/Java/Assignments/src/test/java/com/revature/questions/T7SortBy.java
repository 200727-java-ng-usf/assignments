package com.revature.questions;

import com.revature.util.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
    public void t7SortNothing(){
        ArrayList<Employee> employees = new ArrayList<>();
        q7.EmployeeSort(employees);
        System.out.println(employees);
        assertArrayEquals(new Employee[]{}, employees.toArray());
    }

    @Test
    public void t7SortSortedDepartment(){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jim", "Parker", "DEV", 32));
        employees.add(new Employee("Jim", "Parker", "HR", 32));
        ArrayList<Employee> people = new ArrayList<>(employees);
        q7.EmployeeSort(people);
        System.out.println(people);
        assertArrayEquals(employees.toArray(), people.toArray());
    }

    @Test
    public void t7SortUnsortedDepartment(){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jim", "Parker", "HR", 32));
        employees.add(new Employee("Jim", "Parker", "DEV", 32));
        ArrayList<Employee> people = new ArrayList<>(employees);
        q7.EmployeeSort(people);
        System.out.println(people);
        assertArrayEquals(new Employee[]{
                        new Employee("Jim", "Parker", "DEV", 32),
                        new Employee("Jim", "Parker", "HR", 32)},
                people.toArray());
    }

    @Test
    public void t7SortSortedFName(){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jim", "Parker", "DEV", 32));
        employees.add(new Employee("Timothy", "Parker", "DEV", 32));
        ArrayList<Employee> people = new ArrayList<>(employees);
        q7.EmployeeSort(people);
        System.out.println(people);
        assertArrayEquals(employees.toArray(), people.toArray());
    }

    @Test
    public void t7SortUnsortedFName(){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Timothy", "Parker", "DEV", 32));
        employees.add(new Employee("Jim", "Parker", "DEV", 32));
        ArrayList<Employee> people = new ArrayList<>(employees);
        q7.EmployeeSort(people);
        System.out.println(people);
        assertArrayEquals(new Employee[]{
                        new Employee("Jim", "Parker", "DEV", 32),
                        new Employee("Timothy", "Parker", "DEV", 32)},
                people.toArray());
    }

    @Test
    public void t7SortSortedLName(){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jim", "Darker", "DEV", 32));
        employees.add(new Employee("Jim", "Parker", "DEV", 32));
        ArrayList<Employee> people = new ArrayList<>(employees);
        q7.EmployeeSort(people);
        System.out.println(people);
        assertArrayEquals(employees.toArray(), people.toArray());
    }

    @Test
    public void t7SortUnsortedLName(){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jim", "Parker", "DEV", 32));
        employees.add(new Employee("Jim", "Darker", "DEV", 32));
        ArrayList<Employee> people = new ArrayList<>(employees);
        q7.EmployeeSort(people);
        System.out.println(people);
        assertArrayEquals(new Employee[]{
                        new Employee("Jim", "Darker", "DEV", 32),
                        new Employee("Jim", "Parker", "DEV", 32)},
                people.toArray());
    }

    @Test
    public void t7SortSortedAge(){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jim", "Parker", "DEV", 30));
        employees.add(new Employee("Jim", "Parker", "DEV", 32));
        ArrayList<Employee> people = new ArrayList<>(employees);
        q7.EmployeeSort(people);
        System.out.println(people);
        assertArrayEquals(employees.toArray(), people.toArray());
    }

    @Test
    public void t7SortUnsortedAge(){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jim", "Parker", "DEV", 32));
        employees.add(new Employee("Jim", "Parker", "DEV", 30));
        ArrayList<Employee> people = new ArrayList<>(employees);
        q7.EmployeeSort(people);
        System.out.println(people);
        assertArrayEquals(new Employee[]{
                        new Employee("Jim", "Parker", "DEV", 30),
                        new Employee("Jim", "Parker", "DEV", 32)},
                people.toArray());
    }

    @Test
    public void t7SortUnsortedAgeEdge(){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jim", "Parker", "DEV", 32));
        employees.add(new Employee("Jim", "Parker", "DEV", 30));
        ArrayList<Employee> people = new ArrayList<>(employees);
        q7.EmployeeSort(people);
        System.out.println(people);
        assertArrayEquals(new Employee[]{
                        new Employee("Jim", "Parker", "DEV", 30),
                        new Employee("Jim", "Parker", "DEV", 32)},
                people.toArray());
    }

    @Test
    public void t7SortSortedEquals(){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jim", "Parker", "DEV", 32));
        employees.add(new Employee("Jim", "Parker", "DEV", 32));
        ArrayList<Employee> people = new ArrayList<>(employees);
        q7.EmployeeSort(people);
        System.out.println(people);
        assertArrayEquals(employees.toArray(), people.toArray());
    }
    //endregion

    //region NEGATIVE

    //endregion

}

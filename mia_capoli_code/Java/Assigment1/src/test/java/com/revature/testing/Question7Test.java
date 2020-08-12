package com.revature.testing;

import com.revature.questions.Question7;
import com.revature.questions.extras.Employee;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;

public class Question7Test {

    private Question7 question7;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);

    @Before
    public void setup() {
        question7 = new Question7();

    }

    @Test
    public void testSort() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Mia", "Capoli", 22));
        employees.add(new Employee("Wezley", "Singleton", 30));
        ArrayList<Employee> sortedEmployees = new ArrayList<>(employees);
        question7.SortEmployees(sortedEmployees);
        System.out.println(sortedEmployees);
        assertArrayEquals(employees.toArray(), sortedEmployees.toArray());


    }

    @Test
    public void testSortSamePerson() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Mia", "Capoli", 22));
        employees.add(new Employee("Mia", "Capoli", 22));
        ArrayList<Employee> sortedEmployees = new ArrayList<>(employees);
        question7.SortEmployees(sortedEmployees);
        System.out.println(sortedEmployees);
        assertArrayEquals(employees.toArray(), sortedEmployees.toArray());


    }
//
//    @Test
//    public void testNumber() {
//
//
//    }

    @After
    public void tearDown() {
        question7 = null;
    }
}

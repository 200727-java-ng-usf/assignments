package com.revature.questions;

import com.revature.questions.extras.Employee;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class Question7 implements Comparator<Employee> {
    //override the comparator class to implement the employee object we made in our pojo
    @Override
    public int compare(Employee employee1, Employee employee2) {
        //if the A employee's age is less than the B employee's age, return 1
        if (employee1.getAge() > employee2.getAge()) {
            return 1;
            //if the A employee's age is grater than the B employee's age, return -1
        } else if (employee1.getAge() < employee2.getAge()) {
            return -1;
        } else {
            //else,  compare last names using above
            int result = employee1.getLastName().compareTo(employee2.getLastName());

            //if the same, check first names too.
            if (result == 0) {
                return employee1.getFirstName().compareTo(employee2.getFirstName());
            } else {
                return result;
            }
        }
    }



}
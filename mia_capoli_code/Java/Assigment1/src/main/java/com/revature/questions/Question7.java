package com.revature.questions;

import com.revature.questions.extras.Employee;

import java.util.Comparator;

public class Question7 implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        if (employee1.getAge() > employee2.getAge()) {
            return 1;
        } else if (employee1.getAge() < employee2.

                getAge()) {
            return -1;
        } else {
            int result = employee1.getLastName().compareTo(employee2.getLastName());

            if (result == 0) {
                return employee1.getFirstName().compareTo(employee2.getFirstName());
            } else {
                return result;
            }
        }
    }
}
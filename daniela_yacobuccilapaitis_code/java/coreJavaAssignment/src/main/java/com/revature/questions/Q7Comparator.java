package com.revature.questions;

import java.util.Comparator;

//Q7. Sort two employees based on their name, department,
// and age using the Comparator interface.
public class Q7Comparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {

        if(e1.getName().compareTo(e2.getName()) != 0)
            return e1.getName().compareTo(e2.getName());

        if (e1.getDepartment().compareTo(e2.getDepartment()) != 0)
            return e1.getDepartment().compareTo(e2.getDepartment());

            return e1.getAge()-e2.getAge();

    }

}

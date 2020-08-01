package com.revature.questions;

import com.revature.testHelpers.Employee;

public class Q7SortBy /*extends Comparator<T>*/{
//    Q7. Sort two employees based on their name, department, and age using the Comparator interface.
    public void EmployeeSort(Employee[] people){
        if (people[0].compare(people[0], people[1]) > 0) {
            Employee temp = people[0];
            people[0] = people[1];
            people[1] = temp;
        }
    }
}

package com.revature.questions;

import com.revature.util.Employee;
import com.revature.util.EmployeeComparator;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A <code>Q7SortBy</code> sorts employees using an <code>{@link EmployeeComparator}</code>.
 * @author stephen.brasel@gmail.com
 */
public class Q7SortBy /*extends Comparator<T>*/{
//    Q7. Sort two employees based on their name, department, and age using the Comparator interface.

    /**
     * Sorts an ArrayList of Employees using an EmployeeComparator.
     * @param people the ArrayList of Employees to sort.
     */
    public void EmployeeSort(ArrayList<Employee> people){
//        if (people[0].compare(people[0], people[1]) > 0) {
//            Employee temp = people[0];
//            people[0] = people[1];
//            people[1] = temp;
//        }
        if(people == null) return;
        people.sort(new EmployeeComparator());
    }
}

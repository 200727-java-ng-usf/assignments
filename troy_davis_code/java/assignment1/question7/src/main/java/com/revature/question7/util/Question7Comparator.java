/**
 * Q7. Sort two employees based on their:
 *     - name,
 *     - department,
 *     - and age
 *     - using the Comparator interface.
 */
package com.revature.question7.util;

import com.revature.question7.models.Question7EmployeeModel;

import java.util.Comparator;

public class Question7Comparator implements Comparator<Question7EmployeeModel> {

    @Override
    public int compare(Question7EmployeeModel emp1, Question7EmployeeModel emp2) {
        //check for null values first return 0 if so
        if (emp1 == null || emp2 == null){
            return 0;
        }
        //compare the employees based on age first
        if (emp1.getAge() > emp2.getAge()){
            //if the employee is older, return 1
            return 1;
        }else if(emp1.getAge() < emp2.getAge()){
            //if the employee is younger return -1
            return -1;
        }
        else if(emp1.getDepartment().compareTo(emp2.getDepartment()) > 0){
            //they are the same age, check if they are in different departments, if so sort by name
            return 1;

        }else if (emp1.getDepartment().compareTo(emp2.getDepartment()) < 0){
            return -1;
        }
        else if (emp1.getName().compareTo(emp2.getName()) > 0){
            return 1;
        }
        else if (emp1.getName().compareTo(emp2.getName()) < 0){
            return -1;
        }
        else return 0;




    }
}

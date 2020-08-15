package com.revature.questions;

import java.util.ArrayList;

public class Q7 {

    public void sort(ArrayList<Employee> employeeList) {
        employeeList.sort(new Q7Comparator());
    }
}

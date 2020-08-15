package com.revature.question7;

import java.util.ArrayList;

public class AppDriver {

    public static void main(String[] args) {
        //Creating employees
        Question7 emp1 = new Question7("carlos", "transportation", 28);
        Question7 emp2 = new Question7("eric", "supply", 30);
        //Creating Arraylist to hold the employees
        ArrayList<Question7> emp = new ArrayList<>();
        // Adding employees to arraylist
        emp.add(emp1);
        emp.add(emp2);


        Question7 emp3 = new Question7("hello", "science", 40);
        emp.add(emp3);




        //Sorting employees by age or department or name
        emp.sort((employee1, employee2) -> {

            if (employee1.getAge() > employee2.getAge()) {
                return 1;
            } else if (employee1.getAge() < employee2.getAge()) {
                return -1;
            } else {
                int result = employee1.getDepartment().compareTo(employee2.getDepartment());

                if (result == 0) {
                    return employee1.getName().compareTo(employee2.getName());
                } else {
                    return result;
                }
            }
        });
        emp.forEach(System.out::println);

    }

    public void sortName(Question7 name) {

    }
}



package com.revature.question7;

import com.revature.question7.models.Question7EmployeeModel;
import com.revature.question7.util.Question7Comparator;

import java.util.ArrayList;

public class Question7 {
    public static void main(String[] args) {
        Question7EmployeeModel employee1 = new Question7EmployeeModel("Tom", "Management", 25);
        Question7EmployeeModel employee2 = new Question7EmployeeModel("John", "Management", 35);
        Question7EmployeeModel employee3 = new Question7EmployeeModel("Bob", "Kitchen", 20);
        Question7EmployeeModel employee4 = new Question7EmployeeModel("Eric", "Kitchen", 20);
        Question7EmployeeModel employee5 = new Question7EmployeeModel("Timmy", "Management", 30);
        Question7EmployeeModel employee6 = new Question7EmployeeModel("Jimmy", "Management", 30);
        Question7EmployeeModel employee7 = new Question7EmployeeModel("Tom", "Kitchen", 25);
        Question7EmployeeModel employee8 = new Question7EmployeeModel("John", "Kitchen", 35);
        ArrayList<Question7EmployeeModel> employeeList = new ArrayList<>();

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        employeeList.add(employee8);

        employeeList.forEach(System.out::println); // print the array List using a Lambda expression

        employeeList.sort(new Question7Comparator());
        System.out.println("++------------------------------++");

        employeeList.forEach(System.out::println); // print the array List using a Lambda expression
    }
}

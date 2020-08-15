package com.revature;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class Q7Employee{

    String name;
    int age;
    String department;

    Q7Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Used to print student details in main()
    public String toString() {
        return "Employee- Name: " +
                name + ", Age: " +
                age + ", Department: " +
                department;
    }
}

 class SortByName implements Comparator<Q7Employee>{

    public int compare(Q7Employee firstEmp, Q7Employee secondEmp){
        return firstEmp.name.compareTo(secondEmp.name);
    }
}

class SortByAge implements Comparator<Q7Employee> {

    public int compare(Q7Employee first, Q7Employee second) {
        return first.age-second.age;
    }
}

class SortByDepartment implements Comparator<Q7Employee> {

    public int compare(Q7Employee first, Q7Employee second) {
        return first.department.compareTo(second.department);
    }
}

class Main
{
    public static void main(String[] args) {
        // creating and adding an array list of employees
        ArrayList<Q7Employee> empList = new ArrayList<>();
        empList.add(new Q7Employee("Ku", 50, "Computer Science"));
        empList.add(new Q7Employee("Ndjatou", 45, "Linguistics"));
        empList.add(new Q7Employee("Delaney", 35, "Physics"));

        // print what was added in the array list before applying sort
        System.out.println("List before Sorting");
        for (int employee = 0; employee < empList.size(); employee++)
            System.out.println(empList.get(employee));

        // after sorting in several manners
        System.out.println("\nSorted list by name: ");
        Collections.sort(empList, new SortByName());
        for (int i = 0; i < empList.size(); i++)
            System.out.println(empList.get(i));

//        System.out.println("\nSorted list by age: ");
//        Collections.sort(empList, new SortByAge());
//        for (int i = 0; i < empList.size(); i++)
//            System.out.println(empList.get(i));
//
//        System.out.println("\nSorted list by department: ");
//        Collections.sort(empList, new SortByDepartment());
//        for (int i = 0; i < empList.size(); i++)
//            System.out.println(empList.get(i));
    }
}
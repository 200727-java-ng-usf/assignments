package com.revature.questions;

import java.util.Comparator;

public class Employee7 {
    private String name;
    private String department;
    private int age;
    Employee7 e1 = new Employee7("Mia", "IT", 22);
    Employee7 e2 = new Employee7("Jeff", "Sales", 28);

    public Employee7() {

    }

    private  Employee7(String name, String department, int age) {
        this.name = name;
        this. department = department;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //public void sortEmployeesName() {
     //   Comparator<Employee7> nameOrder = (Comparator<Employee7>) Comparator.comparing(e1.getName(), e2,getName(), String.CASE_INSENSITIVE_ORDER);


   // }


}

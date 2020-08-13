package com.revature.util;

import java.util.Objects;

public class Employee {
    String fname;
    String lname;
    String department;
    int age;

    public Employee(String fname, String lname, String department, int age) {
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.age = age;
    }

//    public String getFname() {
//        return fname;
//    }
//
//    public void setFname(String fname) {
//        this.fname = fname;
//    }
//
//    public String getLname() {
//        return lname;
//    }
//
//    public void setLname(String lname) {
//        this.lname = lname;
//    }
//
//    public String getName(){
//        return fname + " " + lname;
//    }

    /*
        @param name should be a String array of 2 elements, a first and last name.
     */
//    public void setName(String[] name){
//        this.fname = name[0];
//        this.lname = name[1];
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(fname, employee.fname) &&
                Objects.equals(lname, employee.lname) &&
                Objects.equals(department, employee.department);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(fname, lname, department, age);
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "First Name='" + fname + '\'' +
                ", Last Name='" + lname + '\'' +
                ", Department='" + department + '\'' +
                ", Age=" + age +
                '}';
    }

}

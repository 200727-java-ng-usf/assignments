package com.revature.testHelpers;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Employee implements Comparator {
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

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getName(){
        return fname + " " + lname;
    }

    /*
        @param name should be a String array of 2 elements, a first and last name.
     */
    public void setName(String[] name){
        this.fname = name[0];
        this.lname = name[1];
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

    @Override
    public int hashCode() {
        return Objects.hash(fname, lname, department, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "First Name='" + fname + '\'' +
                ", Last Name='" + lname + '\'' +
                ", Department='" + department + '\'' +
                ", Age=" + age +
                '}';
    }

    /*
        Employees are compared by department, name, then age.
     */
    @Override
    public int compare(Object o1, Object o2) {
        if(o1.equals(o2)) return 0;
        if(((Employee)o1).department.compareTo(((Employee)o2).department) < 0){
            return -1;
        } else if (((Employee)o1).department.compareTo(((Employee)o2).department) > 0){
            return 1;
        }
        if(((Employee)o1).fname.compareTo(((Employee)o2).fname) < 0){
            return -1;
        } else if(((Employee)o1).fname.compareTo(((Employee)o2).fname) > 0){
            return 1;
        }
        if(((Employee)o1).lname.compareTo(((Employee)o2).lname) < 0){
            return -1;
        } else if(((Employee)o1).lname.compareTo(((Employee)o2).lname) > 0){
            return 1;
        }
        if(((Employee)o1).age < (((Employee)o2).age)){
            return -1;
        } else if(((Employee)o1).age > (((Employee)o2).age)){
            return 1;
        }
        return 0;
    }

    //TODO COMPLETE EMPLOYEE INTERFACE
    @Override
    public Comparator reversed() {
        return null;
    }

    @Override
    public Comparator thenComparing(Comparator other) {
        return null;
    }

    @Override
    public Comparator thenComparingInt(ToIntFunction keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparingLong(ToLongFunction keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparingDouble(ToDoubleFunction keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparing(Function keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparing(Function keyExtractor, Comparator keyComparator) {
        return null;
    }
}

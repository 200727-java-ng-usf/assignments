package com.revature.JavaCoreAssign;

import java.util.*;

//Q7. Sort two employees based on their name, department, and age using the Comparator interface.
public class QuestionSeven implements Comparator<QuestionSeven> {

    private String name;
    private String department;
    private int age;


    public static void main(String[] args) {
        ArrayList employeeDetials = new ArrayList();


        QuestionSeven employeeOne = new QuestionSeven("Eli", "Software Development", 24);
        QuestionSeven employeeTwo = new QuestionSeven("xenia", "Custodial Services", 23);

        employeeDetials.add(employeeOne);
        employeeDetials.add(employeeTwo);

        System.out.println("not yet sorted");
        employeeDetials.forEach(System.out::println);

        Collections.sort(employeeDetials, new QuestionSeven());

        System.out.println("sorted now");
        employeeDetials.forEach(System.out::println);

    }

    public QuestionSeven() {
        this.name = "John";
        this.department = "Human Resources";
        this.age = 30;
    }

    @Override
    public int compare(QuestionSeven e1, QuestionSeven e2) {
        // Compare name first
        if (e1.getName().compareTo(e2.getName()) > 0) {
            return 1;
        } else if (e1.getName().compareTo(e2.getName()) < 0) {
            return -1;
        } else { // Compare Department next
            if (e1.getDepartment().compareTo(e2.getDepartment()) > 0) {
                return 1;
            } else if (e1.getDepartment().compareTo(e2.getDepartment()) < 0) {
                return -1;
            } else { // Compare age next
                if (e1.getAge() > e2.getAge()) {
                    return 1;
                } else if (e1.getAge() < e2.getAge()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }

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

    @Override
    public String toString() {
        return "QuestionSeven{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }

    public QuestionSeven(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionSeven that = (QuestionSeven) o;
        return getAge() == that.getAge() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getDepartment(), that.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDepartment(), getAge());
    }
}
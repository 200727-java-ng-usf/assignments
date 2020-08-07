/**
 * Q7. Sort two employees based on their:
 *     - name,
 *     - department,
 *     - and age
 *     - using the Comparator interface.
 */

package com.revature.question7.models;

import java.util.Objects;

public class Question7EmployeeModel {
    private String name;
    private String department;
    private int age;

    public Question7EmployeeModel(String name, String department, int age) {
        this.name = name;
        this.department = department;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question7EmployeeModel)) return false;
        Question7EmployeeModel question7EmployeeModel = (Question7EmployeeModel) o;
        return getAge() == question7EmployeeModel.getAge() &&
                Objects.equals(getName(), question7EmployeeModel.getName()) &&
                Objects.equals(getDepartment(), question7EmployeeModel.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDepartment(), getAge());
    }

    @Override
    public String toString() {
        return "Question7{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }
}

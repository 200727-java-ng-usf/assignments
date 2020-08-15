package com.revature.question7;

import java.util.Comparator;
import java.util.Objects;

public class Question7{

    private String name;
    private String department;
    private Integer age;

    public Question7() {
        super();
    }

    public Question7(String name, String department, Integer age) {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question7 question7 = (Question7) o;
        return Objects.equals(name, question7.name) &&
                Objects.equals(department, question7.department) &&
                Objects.equals(age, question7.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, age);
    }

    @Override
    public String toString() {
        return "Question7{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }

    static class comName implements Comparator<Question7> {
        @Override
        public int compare(Question7 name1, Question7 name2) {
            // sort employee by name
            return name1.name.compareTo(name2.name);
        }
    }

}

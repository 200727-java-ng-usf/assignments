package com.revature.question20.models;

import java.util.Objects;

//simple POJO  to represent a person
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String state;

    public Person(){
        super();
    }
    public Person(String firstName, String lastName, int age, String state) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.state = state;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getFirstName(), person.getFirstName()) &&
                Objects.equals(getLastName(), person.getLastName()) &&
                Objects.equals(getState(), person.getState());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAge(), getState());
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + '\'' +
                ", Age: " + age +
                ", State: " + state + " State"+ '\'';
    }
}

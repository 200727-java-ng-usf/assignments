package com.revature.assignment1;

import java.util.Objects;

public class Users {


    private String firstName;
    private String lastName;
    private String state;
    private int age;

    public  Users()
    {

    }
    public Users(String firstName,String lastName, String state, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.state = state;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return age == users.age &&
                Objects.equals(firstName, users.firstName) &&
                Objects.equals(lastName, users.lastName) &&
                Objects.equals(state, users.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, state, age);
    }

    @Override
    public String toString() {
        return "Users{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", state='" + state + '\'' +
                ", age=" + age +
                '}';
    }
}

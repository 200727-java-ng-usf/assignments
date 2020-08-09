package mainpackage.models;

import java.util.Objects;

public class User {

    // First, declare the fields
    private String firstname;
    private String lastname;
    private int age;
    private String state;

//    public User() {
//
//    }

    // Constructor with four args
    public User(String firstname, String lastname, int age, String state) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.state = state;
    }

    // Getters and setters
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    // Sends it to a filestring
    public String toFileString() {
        return firstname + ":" + lastname + ":" + age + ":" + state;
    }

    // Check class
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return firstname == user.firstname &&
                Objects.equals(lastname, user.lastname) &&
                Objects.equals(age, user.age) &&
                Objects.equals(state, user.state);
    }

    // Create hashcode
    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, age, state);
    }

    // The final string, formatted properly
    @Override
    public String toString() {
        return "Name: " + firstname + lastname + '\'' +
                "Age: " + age + '\'' +
                "State: " + state;
    }


}



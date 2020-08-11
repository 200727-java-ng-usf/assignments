package com.revature.models;
import java.util.Objects;

public class Profile {
    private int age;
    private String firstName;
    private String lastName;
    private String location;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return age == profile.age &&
                Objects.equals(firstName, profile.firstName) &&
                Objects.equals(lastName, profile.lastName) &&
                Objects.equals(location, profile.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, firstName, lastName, location);
    }

    @Override
    public String toString() {
        return
                "Name: " + firstName + " " +lastName+ "\n" +
                "Age: " + age + "\n"+
                "State: " + location+" State \n" ;
    }
}

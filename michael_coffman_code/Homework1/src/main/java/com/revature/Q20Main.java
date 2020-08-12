package com.revature;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q20Main {

    String firstName;
    String lastName;
    int age;
    String state;

    // no args constructor because you apprently need one even with a full args constructor
    public Q20Main() {
        super();
    }

    public Q20Main(String firstName, String lastName, int age, String state) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n"
                + "Age: " + age + " years \n"
                + "State: " + state + " state\n";
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

    public static void main(String[] args) throws IOException {

        File question20 = new File("src/main/resources/Data.txt");
        List<Q20Main> userList = new ArrayList<>();

        // i have no idea what this part does, but its in the example.
        if (!question20.exists()) {
            return;
        }

        // creating bufferedReader object to read contents of question20 "Data.txt"
        BufferedReader reader = new BufferedReader(new FileReader(question20));
        String currentLine = reader.readLine();

        while (currentLine != null) {

            // telling the bufferedReader where to split lines
            String[] userFields = currentLine.split(":");

            // each iteration of this loop, a new object will be created and assigned
            // the proper fields
            Q20Main character = new Q20Main();
            character.setFirstName(userFields[0]);
            character.setLastName(userFields[1]);
            character.setAge(Integer.parseInt(userFields[2]));
            character.setState(userFields[3]);

            // add the above user to the list of users
            userList.add(character);

            // tell reader to move to next line
            currentLine = reader.readLine();
        }

        for (Object persons : userList) {
            System.out.println(persons);
        }


    }
}

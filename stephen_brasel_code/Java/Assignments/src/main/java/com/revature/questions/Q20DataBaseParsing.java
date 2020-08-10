package com.revature.questions;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Q20DataBaseParsing {
//    Q20. Create a notepad file called Data.txt and enter the following:
//
//    Mickey:Mouse:35:Arizona
//    Hulk:Hogan:50:Virginia
//    Roger:Rabbit:22:California
//    Wonder:Woman:18:Montana
//
//    Write a program that would read from the file and print it out to the screen in the following format:
//
//    Name: Mickey Mouse
//    Age: 35 years
//    State: Arizona State

    /**
     * A data structure for holding information such as first names, last names, state of home address, and an age.
     */
    public class Person{
        /**
         * The first name of the person.
         */
        private String fname;
        /**
         * The last name of the person
         */
        private String lname;
        /**
         * The state of this person's home address
         */
        private String state;
        /**
         * The age of this person in years.
         */
        private int age;

        /**
         * Constructs a new Person from the following data:
         * @param fname the first name of the person
         * @param lname the last name of the person
         * @param age the state of this person's home address
         * @param state the age of this person in years.
         */
        public Person(String fname, String lname, int age, String state) {
            this.fname = fname;
            this.lname = lname;
            this.state = state;
            this.age = age;
        }

        /**
         * @return a string representation of this person including their name, age, and home state.
         */
        @Override
        public String toString() {
            return "Name: " + fname + " " + lname + '\n' +
                    "Age: " + age + " years\n" +
                    "State: " + state + " State\n"
                    ;
        }

//        public String getFname() {
//            return fname;
//        }
//
//        public void setFname(String fname) {
//            this.fname = fname;
//        }
//
//        public String getLname() {
//            return lname;
//        }
//
//        public void setLname(String lname) {
//            this.lname = lname;
//        }
//
//        public String getState() {
//            return state;
//        }
//
//        public void setState(String state) {
//            this.state = state;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public void setAge(int age) {
//            this.age = age;
//        }
    }

    /**
     * A Storage space for the <code>{@link Person}</code>s being read from file.
     */
    private ArrayList<Person> people;

    /**
     * @return the <code>{@link ArrayList}</code><<code>{@link Person}</code>> <code>{@link #people}</code>
     *          that holds all of the <code>{@link Person}</code>s read from file.
     */
    public ArrayList<Person> getPeople() {
        return people;
    }

    /**
     * Constructs a new instance of this class by populating <code>{@link #people}</code> with
     * a list of <code>{@link Person}</code>s read from the file at {@code _filepath}.
     * @param _filepath the path of the file holding <code>{@link Person}</code> data
     *                  in ':' seperated values, i.e. <br><br>
     *                  Wonder:Woman:18:Montana
     */
    public Q20DataBaseParsing(String _filepath) {
        people = new ArrayList<>();
        String filepath = new File("").getAbsolutePath();
        filepath = filepath.concat(_filepath);
//        System.out.println(filepath);
        File file = new File(filepath);
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                String[] split = data.split(":");

                people.add(new Person(
                        split[0],
                        split[1],
                        Integer.parseInt(split[2]),
                        split[3]));
            }
            scanner.close();
        } catch(FileNotFoundException e) {
            System.out.println("The file was not found at the specified location.");
            e.printStackTrace();
        }
    }
}

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
    public class Person{
        private String fname;
        private String lname;
        private String state;
        private int age;

    public Person(String fname, String lname, int age, String state) {
        this.fname = fname;
        this.lname = lname;
        this.state = state;
        this.age = age;
    }

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

    private ArrayList<Person> people;

    public ArrayList<Person> getPeople() {
        return people;
    }

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

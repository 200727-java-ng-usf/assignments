package com.revature;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Q20 {

    public static class Person {

        private String name;
        private int age;
        private String state;

        public Person(String name, int age, String state) {
            this.name = name;
            this.age = age;
            this.state = state;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getState() {
            return state;
        }

        @Override
        public String toString() {
            return String.format("Name: %s\nAge: %d\nState: %s",name, age, state);
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj) return true;

            if(!(obj instanceof Person)) return false;

            Person p = (Person) obj;

            return age == p.getAge()
                    && name.equals(p.getName())
                    && state.equals(p.getState());

        }
    }

    public static List<Person> getPeopleList()
     throws IOException {

        BufferedReader reader = Files.newBufferedReader(Paths.get("src/main/resources/Data.txt"));

        List<Person> personList = reader.lines()
                            .map(line -> line.split(":"))
                            .map(arr -> new Person(arr[0] + " " + arr[1], Integer.parseInt(arr[2]), arr[3]))
                            .collect(Collectors.toList());

        for(Person p : personList){
            System.out.println(p.toString());
        }

        return personList;
    }
}
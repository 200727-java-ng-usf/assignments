package com.revature.question20;

import com.revature.question20.models.Person;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Q20. Create a notepad file called Data.txt and enter the following:
 *
 * Mickey:Mouse:35:Arizona
 * Hulk:Hogan:50:Virginia
 * Roger:Rabbit:22:California
 * Wonder:Woman:18:Montana
 *
 * Write a program that would read from the file and print it out to the screen in the following format:
 *
 * Name: Mickey Mouse
 * Age: 35 years
 * State: Arizona State
 */
public class Question20 {
    //create a file object and use the relative path to the text file
    File userData =new File("src/main/resources/Data.txt");
    List<Person> people;

    public Question20(){
        //read from the file upon instantiation
        if(userData.exists()){
            try {
                people = new ArrayList<>();
                //using buffered Reader
                BufferedReader reader =new BufferedReader(new FileReader(userData));
                String currentLine = reader.readLine();
                while (currentLine != null){
                    String[] userFields = currentLine.split(":"); //split string into new array
                    Person person = new Person(); //create empty instance of a person
                    //assign fields
                    person.setFirstName(userFields[0]);
                    person.setLastName(userFields[1]);
                    person.setAge(Integer.parseInt(userFields[2]));
                    person.setState(userFields[3]);
                    //add to list
                    people.add(person);
                    currentLine = reader.readLine();
                }
                reader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        //print the first user as instructed
        System.out.print(people.get(0));
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question20)) return false;
        Question20 that = (Question20) o;
        return Objects.equals(userData, that.userData) &&
                Objects.equals(getPeople(), that.getPeople());
    }

    @Override
    public int hashCode() {
        return Objects.hash(userData, getPeople());
    }

    @Override
    public String toString() {
        return "Question20{" +
                "userData=" + userData +
                ", people=" + people +
                '}';
    }
}

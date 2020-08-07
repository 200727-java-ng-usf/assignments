package com.revature;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Q20 {
    //Create a notepad file called Data.txt and enter the following:
    //
    //Mickey:Mouse:35:Arizona
    //Hulk:Hogan:50:Virginia
    //Roger:Rabbit:22:California
    //Wonder:Woman:18:Montana
    //
    //Write a program that would read from the file and print it out to the screen in the following format:
    //
    //Name: Mickey Mouse
    //Age: 35 years
    //State: Arizona State

    public static void dataRead(){

        try {

            File users = new File("src/main/resources/Data.txt");
            List<Q20User> usersList = new ArrayList<>(); //create q20 user list

            BufferedReader reader = new BufferedReader(new FileReader(users));
            String currentLine = reader.readLine(); //read each line
            while (currentLine != null) {
                String[] userFields = currentLine.split(":"); //split up each line
                Q20User user = new Q20User(); //instantiate new user for each run

                user.setFirstN(userFields[0]);
                user.setLastN(userFields[1]);
                user.setAge(Integer.parseInt(userFields[2]));
                user.setState(userFields[3]);

                usersList.add(user); //add user to list

                currentLine = reader.readLine(); //reader to next line

            }
            //displays all the stuff
            for(Q20User u : usersList){
                u.printData();
                System.out.println();
            }
            reader.close();
        } catch(Exception E){
            System.out.println("AHHHH");
        }
    }


}

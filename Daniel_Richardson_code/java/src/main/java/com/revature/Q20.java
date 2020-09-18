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


    //i considered making a DataHandler class but this is the only one that would need it
    public Q20(){

        //debug
        //it worked once, then it didn't, then it did again

        /*
        System.out.println();
        //File myObj = new File("Daniel_Richardson_code\\java\\src\\main\\resources\\Data.txt");
        //File myObj = new File("Daniel_Richardson_code/java/src/main/resources/Data.txt");
        //File myObj = new File("/Daniel_Richardson_code/java/src/main/resources/Data.txt");
        File myObj = new File("java/src/main/resources/Data.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
        */

        dataRead();
    }

    public void dataRead(){
        try {
            File users = new File("java/src/main/resources/Data.txt");
            //System.out.println(users.canRead());
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
            E.printStackTrace();
            System.out.println("AHHHH");
        }
    }


}

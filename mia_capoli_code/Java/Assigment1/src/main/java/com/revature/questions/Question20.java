package com.revature.questions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Question20 {
    public String readFromFile() {

        // create a File object, and use the relative path of the text file
        File data = new File("src/main/resources/Data.txt");
        String test = "";
        //if the file doesn't exist.... no way
        if (!data.exists()) {
            return "";
        }

        try {
            //read from the file
            BufferedReader reader = new BufferedReader(new FileReader(data));
            String currentLine = reader.readLine();

            // if currentLine == null, then we reached the end of the file so we can stahp.
            while (currentLine != null) {
                String[] person = currentLine.split(":");
                System.out.println("Name: " + person[0] + " " + person[1] + "\n" + "Age: " + person[2] + " years" + "\n" + "State: " + person[3] + " State");
                test = test + "Name: " + person[0] + " " + person[1] + "\n" + "Age: " + person[2] + " years" + "\n" + "State: " + person[3] + " State\n";
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                currentLine = reader.readLine(); // move to next line in file
            }
            return test;
        //catch exceptions
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading the file.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong...");
        }
        return "";
    }
}

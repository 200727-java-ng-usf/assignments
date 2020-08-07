package com.revature.questions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Question20 {
    public void readFromFile() {

        // create a File object, and use the relative path of the text file
        File data = new File("src/main/resources/Data.txt");

        if (!data.exists()) {
            return;
        }

        try {

            BufferedReader reader = new BufferedReader(new FileReader(data));
            String currentLine = reader.readLine();

            // if currentLine == null, then we have reached the end of the file
            while (currentLine != null) {
                String[] person = currentLine.split(":");
                System.out.println("Name: " + person[0] + " " + person[1] + "\n" + "Age: " + person[2] + " years" + "\n" + "State: " + person[3] + " State");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                currentLine = reader.readLine(); // move to next line in file
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading the file.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong...");
        }
    }
}

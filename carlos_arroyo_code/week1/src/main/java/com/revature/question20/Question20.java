package com.revature.question20;


import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Question20 {

    public static void main(String[] args) {

        File userFile = new File("src/main/resources/Data.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(userFile, true))) {

            User newUser = new User(35, "Mickey Mouse", "Arizona");
            writer.write("\n" + newUser.toFileString());

            newUser = new User(50, "Hulk Hogan", "Virginia");
            writer.write("\n" + newUser.toFileString());

            newUser = new User(22, "Roger Rabbit", "California");
            writer.write("\n" + newUser.toFileString());

            newUser = new User(18, "Wonder Woman", "Montana");
            writer.write("\n" + newUser.toFileString());

        }catch (IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println("--------------------");



        try {
            BufferedReader reader = new BufferedReader(new FileReader(userFile));
            String currentLine = reader.readLine();

            while (currentLine != null) {

                String[] userFields = currentLine.split(":");

                currentLine = reader.readLine();
                for (int i = 0; i < userFields.length; i++) {
                    System.out.println(userFields[i]);
                }
            }
            reader.close();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


    }

}

package com.revature.assignment1;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
/*  Done  */


public class Q20DataFile {
    public static void main(String[] args) {

        // Creating access to a data file name Data.txt
        File dataText = new File("src/main/resources/Data.txt");
        List<Users> usersList = new ArrayList<>();
        // Checks to see if the data file exists or not
        if (!dataText.exists())   {
            return;
        } //End of If (!dataText.exists())

        /** Reference ReadFileDrive to see how split text lines and iplement them into a data file*/



        // Using buffered read to read from the text file
        try {
            BufferedReader textReader = new BufferedReader(new FileReader(dataText));
            String currentLine = textReader.readLine();

            // This while loop will check to make sure that the current line is not empty and start inserting lines from
            // the Data.txt file and into the usersList ArrayList.
            while (currentLine != null){

                // Reads the current line and splits it into a string[] by using
                // the colon as the point of the split.
                String[] userFields = currentLine.split(":");

                // Creating a user Object to start storing our user fields from the
                // data text file
                Users users = new Users();
                users.setFirstName(userFields[0]);
                users.setLastName(userFields[1]);
                users.setAge(Integer.parseInt(userFields[2]));
                users.setState(userFields[3]);

                usersList.add(users);
                currentLine = textReader.readLine();

            }
            textReader.close();

        }catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading a file.");
        } // End try/catch

        /** Printing out the List of individuals in the data.txt file
         Name: [name]
         Age: [age]
         State: [state]
         */
        // For Each loop that iterates through the arrayList that was inputted from the Data.txt
        // the Data.txt i
        for (Users users: usersList){

            System.out.println("Name: " + users.getFirstName() + " " + users.getLastName() + "\n"
            + "Age: " + users.getAge() + "\n" + "State: " + users.getState() + "\n---------");
        }



    }

}

package mainpackage;

// The methods for building the arraylist are in this subpackage
import mainpackage.models.User;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class NotePadReader {

    // Access the filepath
    public void readFromNotePad() {
        File listOfEmployees = new File("src/main/resources/Data.txt");

        // Check that there is such a file
        if(!listOfEmployees.exists()) {
            return;
        }

        // Create arraylist to hold the separated string pieces
        List<User> usersList = new ArrayList<>();

        // Have to use a try block
        try {
            BufferedReader reader = new BufferedReader(new FileReader(listOfEmployees));
            String currentLine = reader.readLine();
            while (currentLine != null) {

                // This line sets the : as the split point
                String[] userFields = currentLine.split(":");

                // Create an instance
                User user = new User("", "", 0, "");

                // The setters from the model supply the fields
                user.setFirstname(userFields[0]);
                user.setLastname(userFields[1]);
                user.setAge(Integer.parseInt(userFields[2]));
                user.setState(userFields[3]);

                // Adds the new user to the list of users
                usersList.add(user);
                currentLine = reader.readLine();

            }
            reader.close();

        } catch (
                IOException ioe) {
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading the file.");
        }
        // Iterate across list
        for(User u : usersList) {
            System.out.println(u);
        }


    }

}

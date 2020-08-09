import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuestionTwenty {

    public static void main(String[] args) throws IOException {

        // create a file object and use the relative path of the text file
        File file = new File("farren_springer_code/java/AssignmentOne/src/main/resources/Data.txt");
        List<QuestionTwentyCharacter> characterList = new ArrayList<>();

        // If there are no more lines of text, exit the main method
        if(!file.exists()){
            return;
        }

        // Use a try block in case the file is not found
        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String currentLine = reader.readLine();

            while (currentLine != null) {

                // read the line, split it into a String[] containing user field values
                String[] userFields = currentLine.split(":");

                // Create a user object and begin setting its field values using the String[]
                QuestionTwentyCharacter user = new QuestionTwentyCharacter(userFields[0], userFields[1], Integer.parseInt(userFields[2]), userFields[3]);
//                user.setFirstName(userFields[0]);
//                user.setLastName(userFields[1]);
//                user.setAge(Integer.parseInt(userFields[2]));
//                user.setHomeState(userFields[3]);

                // Add the created user to our list of users
                characterList.add(user);

                // Tell our reader to move to the next line
                currentLine = reader.readLine();

            }

            reader.close(); // good practice to release connection to the file

        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading the file.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong...");
        }

        // iterate across our list of users and print each one out to the console

        // traditional for loop (any version of Java)
        for (int i = 0; i < characterList.size(); i++) {
            System.out.println(characterList.get(i) + "\n");
        }

    } // end main

} // end class


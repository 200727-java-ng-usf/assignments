import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class has a main method that locates a text file,
 * parses through each line and creates Q20Character objects.
 */
public class Q20CharacterDriver {

    /**
     * Method that takes in a file, prints the objects in the format specified by the question,
     * and returns an ArrayList of QuestionTwentyCharacterObjects.
     */
    public static ArrayList<Q20Character> makeQuestionTwentyCharactersOutOf(File f) {

        List<Q20Character> characterList = new ArrayList<>();

        // Use a try block in case the file is not found
        try {

            BufferedReader reader = new BufferedReader(new FileReader(f));
            String currentLine = reader.readLine();

            while (currentLine != null) {

                // read the line, split it into a String[] containing user field values
                String[] userFields = currentLine.split(":");

                // Create a user object and begin setting its field values using the String[]
                Q20Character user = new Q20Character(userFields[0], userFields[1], Integer.parseInt(userFields[2]), userFields[3]);

                // Add the created user to our list of users
                characterList.add(user);

                // Tell our reader to move to the next line
                currentLine = reader.readLine();

            }

            reader.close(); // good practice to release connection to the file

        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading the file.");
        }

        for (int i = 0; i < characterList.size(); i++) {
            System.out.println(characterList.get(i) + "\n");
        }

        return (ArrayList<Q20Character>) characterList;

    }

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("farren_springer_code/java/AssignmentOne/src/main/resources/Data.txt");

        // If there are no more lines of text, throw an exception
        if (!file.exists()) {
            throw new FileNotFoundException("The file does not exist.");
        }

        makeQuestionTwentyCharactersOutOf(file);

    } // end main

} // end class
// done


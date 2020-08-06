import java.util.Scanner; // Import the Scanner class to read text file
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.lang.Object;

public class QuestionTwenty {

    public static void main(String[] args) throws IOException {

        // create a file object and use the relative path of the text file
        File file = new File("src/main/resources/Data.txt");

        // If there are no more lines of text, exit the main method
        if(!file.exists()){
            return;
        }

        // Use a try block in case the file is not found
        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String currentLine = reader.readLine();

            // If currentLine == null, then we have reached the end of the file
            while (currentLine != null) {
                System.out.println(currentLine); // Print out currentLine
                currentLine = reader.readLine(); // Move to next line in file
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading the file.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong...");
        }

        System.out.println("+-------------------------+");


    } // end main

} // end class


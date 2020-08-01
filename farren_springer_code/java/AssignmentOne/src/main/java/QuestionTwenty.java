import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; // Import the Scanner class to read text file
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class QuestionTwenty {

    public static void main(String[] args) throws IOException {

        // create an object that holds the text in Data.txt
        FileReader myObj = new FileReader("Data.txt");

        // create buffered reader object
        BufferedReader bufRead = new BufferedReader(myObj);
        String firstLine = bufRead.readLine();
        System.out.println(firstLine);

        // test
        ArrayList<String> words = new ArrayList<>();

        // testing
        String line;
        String[] wordsArray;
        while ((line = bufRead.readLine()) != null) {
            String[] tokens = line.split(":");
            System.out.println(Arrays.toString(tokens));
        }

        System.out.println("+-------------------+");


    }

    /*

     */

}


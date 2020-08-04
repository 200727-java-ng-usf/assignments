import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; // Import the Scanner class to read text file
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class QuestionTwenty {

    public static void main(String[] args) throws IOException {

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/assignments/farren_springer_code/java/AssignmentOne/src/main/java/Data.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Which movie character would you like to see more about?");
        System.out.println("Enter 1 for Mickey, 2 for the Hulk, 3 for Roger Rabbit, and 4 for Wonder Woman: ");
        Scanner scanner = new Scanner(System.in);
        int userChoiceNum = scanner.nextInt();
        switch (userChoiceNum) {
            case 1:
                System.out.println("You chose case 1.");
                break;
            case 2:
                System.out.println("You chose case 2.");
                break;
            case 3:
                System.out.println("You chose case 3.");
                break;
            case 4:
                System.out.println("You chose case 4.");
                break;
        }


//        try {
//            File theFileToReadFrom = new File("Data.txt");
//            Scanner scanner = new Scanner(theFileToReadFrom);
//            while (scanner.hasNextLine()) {
//                String data = scanner.nextLine();
//                System.out.println(data);
//            }
//            scanner.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occured.");
//            e.printStackTrace();
//        }


//        // create an object that holds the text in Data.txt
//        FileReader myObj = new FileReader("Data.txt");
//
//        // create buffered reader object
//        BufferedReader bufRead = new BufferedReader(myObj);
//        String firstLine = bufRead.readLine();
//        System.out.println(firstLine);
//
//        // test
//        ArrayList<String> words = new ArrayList<>();
//
//        // testing
//        String line;
//        String[] wordsArray;
//        while ((line = bufRead.readLine()) != null) {
//            String[] tokens = line.split(":");
//            System.out.println(Arrays.toString(tokens));
//        }
//
//        System.out.println("+-------------------+");


    }

    /*

     */

}


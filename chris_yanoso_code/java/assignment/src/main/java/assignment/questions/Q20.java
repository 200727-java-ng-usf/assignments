package assignment.questions;

import assignment.questions.question20.People;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Q20 {
    public void readData() {
        //creates new var for file
        File data = new File("src/main/resources/Data.txt");
        //makes sure it exists
        if (!data.exists()) {
            return;
        }

        List<People> peopleList = new ArrayList<>();
        try{
            //uses Buffered reader to read file and saves to an arraylist
            BufferedReader reader = new BufferedReader(new FileReader(data));
            String currentLine = reader.readLine();

            while(currentLine != null) {
                String[] dataFields = currentLine.split(":");
                People person = new People();
                person.setFirstName(dataFields[0]);
                person.setLastName(dataFields[1]);
                person.setAge(Integer.parseInt(dataFields[2]));
                person.setState(dataFields[3]);
                peopleList.add(person);

                currentLine = reader.readLine();
            }

            reader.close();
            //catches exceptions
        } catch (IOException ioe){
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading the file");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Something went wrong...");
        }
        //for each loop to print out people in arraylist
        for(People p : peopleList){
            System.out.print("\n" + p.toString());
        }
    }
}

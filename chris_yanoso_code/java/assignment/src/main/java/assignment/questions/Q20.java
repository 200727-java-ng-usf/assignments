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
        File data = new File("src/main/resources/Data.txt");

        if (!data.exists()) {
            return;
        }

        List<People> peopleList = new ArrayList<>();
        try{

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

        } catch (IOException ioe){
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading the file");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Something went wrong...");
        }
        for(People p : peopleList){
            System.out.println(p.toString());
        }
    }
}

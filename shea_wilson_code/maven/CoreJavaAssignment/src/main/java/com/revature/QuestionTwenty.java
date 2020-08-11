package com.revature;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Profile; //external java class created to format profile information.


public class QuestionTwenty {

    public static void main(String[] args) {
        //Syntax used to access the Data.txt file, profiles instantiated with that Data.txt file
        File profiles =new File("src/main/resources/Data.txt");

        //created profile ArrayList to organize data soon to be read from the file
        List<Profile> profileList = new ArrayList<>();

        if (!profiles.exists()){ // if that file does not exist return nothing
            return;
        }
        try {
            //instantiated reader with Syntax to read the file
            BufferedReader reader = new BufferedReader(new FileReader(profiles));
            String currentLine = reader.readLine(); //initialize currentLine with reader's readLine method

            while (currentLine!=null){   //while the value of currentLine is not null

                //instantiate String Array profileFields with each value as they are separated by (:)
                String[] profileFields = currentLine.split(":");
                Profile pro = new Profile(); //instantiate Profile object pro
                pro.setAge(Integer.parseInt(profileFields[2])); //set age from index 2
                pro.setFirstName(profileFields[0]); //set firstName from index 0
                pro.setLastName(profileFields[1]); //set lastName from index 1
                pro.setLocation(profileFields[3]); //set location from index 3

                profileList.add(pro); // add all information to the collection
                currentLine = reader.readLine();
            }
            reader.close(); // close the reader
        } catch (IOException e){
            e.printStackTrace();
        }
            profileList.forEach(System.out::println); //print the formatted information

    }
}

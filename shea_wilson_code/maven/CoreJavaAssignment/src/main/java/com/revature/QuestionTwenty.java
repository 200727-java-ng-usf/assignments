package com.revature;


import jdk.jfr.FlightRecorder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class QuestionTwenty {

    public static void main(String[] args) {

        File people =new File("src/main/resources/Data.txt");
        if (!people.exists()){
            return;
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(people));
            String currentLine = reader.readLine();

            while (currentLine!=null){
                System.out.println(currentLine);
                currentLine = reader.readLine();
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }


    }
}

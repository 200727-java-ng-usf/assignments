package com.revature.coreJavaAssign;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class q20Notepad {
    public static void main(String[] args){
        File javaAssignment = new File("src/main/resources/Data.txt");
        //this is edge casing in case the file does not exist
        if(!javaAssignment.exists()){
            return;
        }
        try{
            BufferedReader reader = new BufferedReader(new FileReader(javaAssignment));
            String currentLine = reader.readLine();

            while (currentLine != null){
                //this will make a string array from currentLine split
                // each index by each ":"
                String[] inputs = currentLine.split(":");
                System.out.println("Name: " + inputs[0]+" "+inputs[1]);
                System.out.println("Age: "+inputs[2]+" years");
                System.out.println("State: "+inputs[3]+" State");
                System.out.println("\n");
                currentLine = reader.readLine();
            }

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}

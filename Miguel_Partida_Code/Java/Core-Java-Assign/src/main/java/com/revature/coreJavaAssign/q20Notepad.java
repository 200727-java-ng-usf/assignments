package com.revature.coreJavaAssign;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class q20Notepad {
    public static void main(String[] args) {
        File javaAssignment = new File("src/main/resources/Data.txt");
        boolean fileRead = printFile(javaAssignment);
        if(fileRead){
            System.out.println("You have read the file" );
        }else{
            System.out.println("You did not read the file");
        }

    }
        public static boolean printFile(File javaAssignment){
        boolean readFile = false ;

        //this is edge casing in case the file does not exist
        if(!javaAssignment.exists()){
            return false;
        }

        try{
            BufferedReader reader = new BufferedReader(new FileReader(javaAssignment));
            String currentLine = reader.readLine();
//   if the first line of the txt is empty it will read null and continue to give a false boolean
            //
            if(currentLine !=null){
                readFile = true;
            }

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

        return readFile;
    }
}

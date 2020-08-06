package com.revature;

import java.io.*;

public class Q20 {
    public static void readTxtFile(String filePath){
        try {
            File file=new File(filePath);
            StringBuilder stringBuilder = new StringBuilder();
            if(file.isFile() && file.exists()){ //is the file exist

                InputStreamReader read = new InputStreamReader(new FileInputStream(file));
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt;
                while((lineTxt = bufferedReader.readLine()) != null){

                    String[] word = lineTxt.split(":"); // read
                    stringBuilder.append("Name: ").append(word[0]).append(" ").append(word[1]).append("\n").append("Age: ").append(word[2]).append(" years\n").append("State: ").append(word[3]).append("\n\n");
                }
                System.out.println(stringBuilder.toString());
            }

            } catch (FileNotFoundException e) {
            System.out.println("file is no found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("loading issue !");
            e.printStackTrace();
        }


    }
}




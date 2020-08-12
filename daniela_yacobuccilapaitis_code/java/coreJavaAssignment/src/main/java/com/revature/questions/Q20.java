package com.revature.questions;

import javax.xml.bind.SchemaOutputResolver;
import java.io.*;
import java.util.Scanner;

/*
    Q20. Create a notepad file called Data.txt and enter the following:

    Mickey:Mouse:35:Arizona
    Hulk:Hogan:50:Virginia
    Roger:Rabbit:22:California
    Wonder:Woman:18:Montana

    Write a program that would read from the file and print it out to the
    screen in the following format:

    Name: Mickey Mouse
    Age: 35 years
    State: Arizona State

 */
public class Q20 {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner (new File("src/main/resources/Q20_text.txt"));
            scanner.useDelimiter(":|\\n");
            while(scanner.hasNext()) {
                System.out.println("Name: " + scanner.next() + " " + scanner.next());
                System.out.println("Age: " + scanner.next() + " years");
                System.out.println("State: " + scanner.next() + " state\n");

            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }



    }
}

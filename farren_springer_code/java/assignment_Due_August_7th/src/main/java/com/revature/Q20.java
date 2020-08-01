package com.revature;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q20 {

    public static void main(String[] args) throws FileNotFoundException {

                System.out.println("Hello World!");
                Scanner input = new Scanner(new File ("Data.txt"));
                String answer = input.nextLine();
                System.out.println(answer);

        /*
        Create a notepad file called Data.txt and enter the following:

        Mickey:Mouse:35:Arizona
        Hulk:Hogan:50:Virginia
        Roger:Rabbit:22:California
        Wonder:Woman:18:Montana

        Write a program that would read from the file and print it out to the screen in the following format:

        Name: Mickey Mouse
        Age: 35 years
        State: Arizona State

         */

        // read from the file
        System.out.println("Name: ");
        System.out.println("Age: ");
        System.out.println("State: ");

    }

}

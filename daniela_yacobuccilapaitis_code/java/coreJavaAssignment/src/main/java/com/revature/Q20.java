package com.revature;

import java.io.BufferedReader;
import java.io.FileReader;

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

        BufferedReader br = new BufferedReader(new FileReader(Q20_text.txt));
    }
}

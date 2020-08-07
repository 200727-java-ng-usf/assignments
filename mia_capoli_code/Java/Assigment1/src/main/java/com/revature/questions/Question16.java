package com.revature.questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question16 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Please enter a word: ");
            String word = reader.readLine();
            char[] wordChars = new char[word.length()];
            for (int i = 0; i < word.length(); i++) {
                wordChars[i] = word.charAt(i);
            }
            int amountOfChars = wordChars.length;
            System.out.print("Your word has " + amountOfChars + " characters.");
        }
        // you can declare multiple exceptions in one catch. just use the bitwise OR operator: |
        catch (IOException | ClassCastException | NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        }
    }
}

/**
 * Q16. Write a program to display the number of characters for a string input.
 *      The string should be entered as a command line argument using (String [ ] args).
 */

package com.revature.question16;

import java.util.Objects;

public class Question16 {
    private int numberOfCharacters;

    public Question16(String[] args) {
        //check for null values first
        if (args == null){
            numberOfCharacters = 0;
        } else {
            numberOfCharacters = getNumberOfCharactersInThisStringArray(args);
        }
    }

    //private method to find the number of chars in a given array of strings
    private int getNumberOfCharactersInThisStringArray(String[] aString){
        int tempCharCounter = 0;
        //iterate through the array, counting the chars one by one
        for (String s : aString){
            s = s.trim();
            //iterate through each string, ignoring white spaces
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) != ' '){
                    tempCharCounter++;
                }
            }

        }

        return tempCharCounter;
    }

    public int getNumberOfCharacters() {
        return numberOfCharacters;
    }

    public void setNumberOfCharacters(int numberOfCharacters) {
        this.numberOfCharacters = numberOfCharacters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question16)) return false;
        Question16 that = (Question16) o;
        return getNumberOfCharacters() == that.getNumberOfCharacters();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberOfCharacters());
    }

    @Override
    public String toString() {
        return "Question16{" +
                "numberOfCharacters=" + numberOfCharacters +
                '}';
    }
}

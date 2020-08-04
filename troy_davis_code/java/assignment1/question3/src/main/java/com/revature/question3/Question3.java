/*
    Reverse a string without using a temporary variable.
    Do NOT use reverse() in the StringBuffer or the StringBuilder APIs.
 */

package com.revature.question3;

public class Question3 {
    //fields to hold the given string and the string reversed when a new question object is created
    private String initialString;
    private String reversedString;

    public Question3(String givenString){
        //parameterized constructor that will store the initial string, reverse the string, and store it in the proper String
        this.initialString = givenString;
        this.reversedString = reverseThisString(givenString);
    }

    private String reverseThisString(String givenString){
        //TODO: reverse String

        return givenString;
    }


    //Getter and setter methods
    public String getInitialString() {
        return initialString;
    }

    public void setInitialString(String initialString) {
        this.initialString = initialString;
    }

    public String getReversedString() {
        return reversedString;
    }

    public void setReversedString(String reversedString) {
        this.reversedString = reversedString;
    }

    @Override
    public String toString() {
        return "Question3{" +
                "initialString='" + initialString + '\'' +
                ", reversedString='" + reversedString + '\'' +
                '}';
    }
}

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
        //check for null values first
        if(givenString == null || givenString.length() <2){
            initialString = "";
            reversedString = "";
        }else {
            //parameterized constructor that will store the initial string, reverse the string, and store it in the proper String
            this.initialString = givenString;
            this.reversedString = reverseThisString(initialString);
        }

    }

    private String reverseThisString(String givenString){
        //using for loop on original string, so no temp variables used
        for(int i = 0; i <givenString.length(); i++){
            givenString = givenString.substring(1, givenString.length() -i)
                    + givenString.substring(0,1)
                    + givenString.substring(givenString.length() - i);
        }
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

/**
 * Q5. Write a substring method that accepts a string str and an integer idx and returns the substring contained between:
 * 0 and idx-1 inclusive.
 *      - Do NOT use any of the existing substring methods in the String, StringBuilder, or StringBuffer APIs.
 */

package com.revature.question5;

import java.util.Objects;

public class Question5 {
    private String substring;

    public Question5(){
        this.substring = null;
    }

    public Question5(String givenString, Integer idx) {
        setSubstring(givenString, idx);
    }

    public String getSubstring() {
        return substring;
    }

    public void setSubstring(String str, Integer idx) {

        if (str == null || str.length() == 0 || idx == 0){
            //check for null values first, return empty string if not
            this.substring = "";
        } else if(str.length() == 1) {
            //If the string is only one character, no need to compute
            this.substring = str;
        }else {
            //get a char array from the string
            char[] temp = str.toCharArray();
            //create temporary empty char array
            char[] tempString = new char[idx];
            //get the substring based on te idx -1
            for(int i = 0; i <= idx-1; i++){
                tempString[i] = temp[i];
            }
            //return the string
            this.substring = new String(tempString);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question5)) return false;
        Question5 question5 = (Question5) o;
        return Objects.equals(getSubstring(), question5.getSubstring());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSubstring());
    }

    @Override
    public String toString() {
        return "Question5{" +
                "substring='" + substring + '\'' +
                '}';
    }
}

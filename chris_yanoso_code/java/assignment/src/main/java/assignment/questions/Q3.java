package assignment.questions;

public class Q3 {
    public StringBuilder reverseAString(String str){
        // creates a char list to keep the characters of the string
        char[] reverseString = new char[str.length()];
        //reverses the order of the char list
        for (int i = str.length() - 1; i > -1; i--){
            reverseString[str.length()-1-i] = (str.charAt(i));
        }
        //puts reversed char list back into a string
        StringBuilder finalString = new StringBuilder("");
        finalString.append(reverseString);
        return finalString;
    }
}
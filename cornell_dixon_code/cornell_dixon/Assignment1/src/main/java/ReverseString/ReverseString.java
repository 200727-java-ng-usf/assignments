package com.revature.reverse;


public class ReverseString {
    String statement = " "; //reference the statement


    //use getters and setter constructor so that every input statement can be retrieved and returned in the method
    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public ReverseString() {  //this is what is reversing the statement;
        char[] arrayStatement = statement.toCharArray(); //converts the String into a char
        int left =0;
        int right = arrayStatement.length-1; //this is what gives the index of each char from right to left instead of the normal left to right

        for (left = 0; left < right; left++, right--)  //this for loop, loops through the entire char statement switching the first with the last character, 2nd with 2nd-to-last, and so on
        {
            char placeholderStatement = arrayStatement[left];
            arrayStatement[left] = arrayStatement[right];
            arrayStatement[right] = placeholderStatement;
        }
        for (char a : arrayStatement){
            System.out.print(a);
        }

    }
}

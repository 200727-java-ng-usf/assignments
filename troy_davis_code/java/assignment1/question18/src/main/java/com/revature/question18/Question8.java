package com.revature.question18;
/**
 * Q18. Write a program having a concrete ;subclass that inherits three abstract methods from a superclass.
 * Provide the following three implementations in the subclass corresponding to the abstract methods in the superclass:
 *
 * 1. Check for uppercase characters in a string, and return ‘true’ or ‘false’ depending if any are found.
 * 2. Convert all of the lower case characters to uppercase in the input string, and return the result.
 * 3. Convert the input string to integer and add 10, output the result to the console.
 *
 * Create an appropriate class having a main method to test the above setup.
 */
public class Question8 extends Question18AbstractClass {


    @Override
    public boolean checkForUpperCaseCharacters(String s) {
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (!Character.isUpperCase(c)) {
                return false;
            }
        }
        return true;
    }
    @Override
    public String convertAllLowerCaseToUpperCase(String s) {
        return s.toUpperCase();
    }

    @Override
    public void convertToIntegerAddTenThenPrintResult(String s) {
        //TODO: CONVERT TO INTEGER
    }
}

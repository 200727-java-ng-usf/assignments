package com.revature.questions;

public class Q18Driver {
    public static void main(String[] args) {

        Q18 Q18Obj = new Q18();
        String testString1 = "Testing String one";
        String testString2 = "testing string two";
        String testStringNum = "23";

        System.out.println("Does the String \"" + testString1 + "\" have upper case letters? " +
                Q18Obj.anyUppercaseLetters(testString1));
        System.out.println("Does the String \"" + testString2 + "\" have upper case letters? " +
                Q18Obj.anyUppercaseLetters(testString2));
        System.out.println("The String \"" + testString1 + "\" with all upper case letters is: " +
                Q18Obj.allLowerCaseToUpperCase(testString1));
        System.out.print("The String " + testStringNum + " as a number + 10 is the following: ");

        Q18Obj.addTen(testStringNum);


    }
}

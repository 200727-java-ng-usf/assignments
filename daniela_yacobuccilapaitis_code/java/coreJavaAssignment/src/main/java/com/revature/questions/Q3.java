package com.revature.questions;
import java.util.Scanner;

//Q3. Reverse a string without using a temporary variable.
// Do NOT use reverse() in the StringBuffer or the StringBuilder APIs.
public class Q3 {

    public static void main(String[] args) {
            Q3 obj = new Q3();
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a String");
            String inputString = scan.nextLine();
            scan.close();

            System.out.println("The following is the reversed String: " +
                    obj.reverseString(inputString));

    }

    public String reverseString(String inputString) {

        StringBuilder reversedString = new StringBuilder(inputString.length());
        for(int i = 0, j = inputString.length()-1; i < inputString.length(); i++, j--) {

            reversedString.insert(i, inputString.charAt(j));

        }
        return reversedString.toString();
    }
}

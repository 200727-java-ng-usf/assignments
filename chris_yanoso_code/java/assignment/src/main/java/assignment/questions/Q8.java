package assignment.questions;

import java.util.ArrayList;

public class Q8 {

    public void palindromeTest(ArrayList <String> stringList) {
        //created an empty array for palindromes to go
        ArrayList<String> palindromeList = new ArrayList<>();
        //created an empty array to test the reverse of the initial string
        ArrayList<String> testList = new ArrayList<>();
        //reverses the strings
        for (int i = 0; i < stringList.size(); i++) {
            StringBuilder temp = new StringBuilder(stringList.get(i));
            temp = temp.reverse();
            String temp1 = temp.toString();
            testList.add(temp1);
        }
        //if test = string list, the word must be a palindrome and adds it to the list
        for (int i = 0; i < stringList.size(); i++) {
                if (stringList.get(i).equals(testList.get(i))) {
                    palindromeList.add(stringList.get(i));
                }

        }
        System.out.print("These are palindromes: " + palindromeList);
    }
}

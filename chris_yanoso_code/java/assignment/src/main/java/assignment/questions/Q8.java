package assignment.questions;

import java.util.ArrayList;

public class Q8 {

    public void palindromeTest() {
        ArrayList<String> stringList = new ArrayList<>(11);
        //couldn't figure out to add strings all at once so did individually
        stringList.add("karan");
        stringList.add("madam");
        stringList.add("tom");
        stringList.add("civic");
        stringList.add("radar");
        stringList.add("jimmy");
        stringList.add("kayak");
        stringList.add("john");
        stringList.add("refer");
        stringList.add("billy");
        stringList.add("did");
        //created an empty array for palindromes to go
        ArrayList<String> palindromeList = new ArrayList<>();
        //created an empty array to test the reverse of the initial string
        ArrayList<String> testList = new ArrayList<>();
        //reverses the strings
        for (int i = 0; i < 11; i++) {
            StringBuilder temp = new StringBuilder(stringList.get(i));
            temp = temp.reverse();
            String temp1 = temp.toString();
            testList.add(temp1);
        }
        //if test = string list, the word must be a palindrome and adds it to the list
        for (int i = 0; i < 11; i++) {
                if (stringList.get(i).equals(testList.get(i))) {
                    palindromeList.add(stringList.get(i));
                }

        }
        System.out.println("These are palindromes: " + palindromeList);
    }
}

package com.revature;

import java.util.ArrayList;

public class Question8 {

    public static void main(String[] args) {




        ArrayList<String> notPalindrome = new ArrayList<>();
        ArrayList<String> palindrome = new ArrayList<>();

        ArrayList<String> str = new ArrayList<>();
        str.add("karan");
        str.add("madam");
        str.add("tom");
        str.add("civic");
        str.add("radar");
        str.add("jimmy");
        str.add("kayak");
        str.add("john");
        str.add("refer");
        str.add("billy");
        str.add("did");

        //iterating through the loop and creating a reverse stringbuilder and a original string builder
        for(int i = 0; i < str.size(); i++) {
            StringBuilder reverseString = new StringBuilder(str.get(i));
            StringBuilder normalString = new StringBuilder(str.get(i));
            reverseString.reverse();
//            System.out.println(reverseString);
            // comparing the StringBuilder to see if string is a palindrome
            if (normalString.toString().equals(reverseString.toString())) {
                palindrome.add(String.valueOf(str.get(i)));
                System.out.println("Is a palindrome" + palindrome);
            } else {
                notPalindrome.add(String.valueOf(str.get(i)));
                System.out.println("Is not a palindrome " + notPalindrome);
            }
        }

//        System.out.println("Enter a string: ");
//        str = str.nextLine();





//        if (str.equals(rev)) {
//            palindrome.add(str);
//            System.out.println(palindrome);
//        } else {
//            notPalindrome.add(str);
//            System.out.println("Word is an palindrome: " + notPalindrome);
//        }
//    }
    }
}

package com.revature.questions;

public class Question3 {

    StringBuilder reverser = new StringBuilder("Princess");
    StringBuilder reversedString = new StringBuilder("");

    public void stringReverse () {
        for (int i = 0, j = reverser.length() - 1; i < reverser.length(); i++, j--) {
            reversedString.append(reverser.charAt(j));
        }
        String finalString = reversedString.toString();
        System.out.println(finalString);

    }


}

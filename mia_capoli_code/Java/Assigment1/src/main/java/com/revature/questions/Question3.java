package com.revature.questions;

public class Question3 {

    public void stringReverse (String str) {
        StringBuilder reverser = new StringBuilder("");
        StringBuilder reversedString = new StringBuilder("");
        reverser.append(str);
        for (int i = 0, j = reverser.length() - 1; i < reverser.length(); i++, j--) {
            reversedString.append(reverser.charAt(j));
        }
        String finalString = reversedString.toString();
        System.out.println(finalString);

    }


}

package com.revature.questions;

public class Question3 {

    public void stringReverse (String str) {
        //creating stringbuilder holders to help reverse the array
        StringBuilder reverser = new StringBuilder("");
        StringBuilder reversedString = new StringBuilder("");
        //adding the declared string to the stringbuilder.
        reverser.append(str);
        //appending the current character in the original string to the next value in the stringbuilder in reverse order
        for (int i = 0, j = reverser.length() - 1; i < reverser.length(); i++, j--) {
            reversedString.append(reverser.charAt(j));
        }
        //convert result to a string.
        String finalString = reversedString.toString();
        System.out.println(finalString);

    }


}

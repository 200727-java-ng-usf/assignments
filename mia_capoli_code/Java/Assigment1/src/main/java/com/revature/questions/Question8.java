package com.revature.questions;

import java.util.ArrayList;
import java.util.List;

public class Question8 {

    public void Palindromes() {
        boolean keep = false;
        ArrayList<String> isItAPalindrome = new ArrayList<String>();
        ArrayList<String> itIs = new ArrayList<String>();
        isItAPalindrome.add("karan");
        isItAPalindrome.add("madam");
        isItAPalindrome.add("tom");
        isItAPalindrome.add("civic");
        isItAPalindrome.add("radar");
        isItAPalindrome.add("jimmy");
        isItAPalindrome.add("kayak");
        isItAPalindrome.add("john");
        isItAPalindrome.add("refer");
        isItAPalindrome.add("billy");
        isItAPalindrome.add("did");
        for (int i = 0; i < isItAPalindrome.size(); i++) {
            String current = isItAPalindrome.get(i);
            for (int j = 0, k = current.length() - 1 ; j < current.length(); j++, k--) {
                if (current.charAt(j) == current.charAt(k)) {
                    if (j == (current.length() / 2 + current.length() % 2)) {
                        itIs.add(current);
                        break;
                    }
                    continue;
                } else {
                    break;
                }
            }
        }
        System.out.println(itIs);
    }
}


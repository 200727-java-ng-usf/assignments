package com.revature.questions;

import java.util.ArrayList;
import java.util.List;

public class Question8 {

    public ArrayList<String> Palindromes(ArrayList<String> arrList) {
        boolean keep = false;
        ArrayList<String> isItAPalindrome = arrList;
        ArrayList<String> itIs = new ArrayList<String>();
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
        return itIs;
    }
}


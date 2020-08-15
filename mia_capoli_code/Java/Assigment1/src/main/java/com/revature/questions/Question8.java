package com.revature.questions;

import com.revature.questions.extras.Utils;

import java.util.ArrayList;

public class Question8 {

    public ArrayList<String> Palindromes(ArrayList<String> arrList) {

        //declare storage ArrayLists
        ArrayList<String> isItAPalindrome = arrList;
        ArrayList<String> itIs = new ArrayList<>();

        for (int i = 0; i < isItAPalindrome.size(); i++) {

            // get the current word
            String current = isItAPalindrome.get(i);

            //check the opposite letters for equality.
            for (int j = 0, k = current.length() - 1 ; j < current.length(); j++, k--) {
                //once it reaches the middle letter:
                if (current.charAt(j) == current.charAt(k)) {
                    if (j == (current.length() / 2 + current.length() % 2)) {

                        //if it is a palindrome, add it to the ArrayList
                        itIs.add(current);
                        break;
                    }
                    //else, continue
                    continue;
                } else {
                    //if not the same in the center/even numbered word, break
                    break;
                }
            }
        }
        //return palindromes
        Utils.printObjs(itIs.toArray());
        return itIs;
    }
}


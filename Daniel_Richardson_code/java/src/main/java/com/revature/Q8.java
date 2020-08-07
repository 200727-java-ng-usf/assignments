package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q8 {
    //Q8. Write a program that stores the following strings in an ArrayList and
    // saves all the palindromes in another ArrayList.
    //
    //“karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”

    public static void palinD(){
        String[] names = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john",  "refer", "billy", "did"};
        ArrayList<String> aList = new ArrayList<>();
        ArrayList<String> palinList = new ArrayList<>();
        for(String name : names){ //adding array into aList
            aList.add(name);
            palinList.add(name); //add to both lists
        }

        for (int i = 0;i < palinList.size()-1; i++){
            //System.out.println(elements);
            char[] elChArray = palinList.get(i).toCharArray();
            int halfPoint = (elChArray.length/2);
            int backCounter = elChArray.length-1;
            for(int w = 0; w < halfPoint; w++){ //tests up to half the size of string
                if(elChArray[w] != elChArray[backCounter]){
                    System.out.println("removed "+ palinList.get(i));
                    palinList.remove(i);
                    break; //super important. if we don't break, elements drop down, and it checks new element
                }
                backCounter--;
            }

        }
        for(String elements : palinList){
            System.out.println(elements);
        }


    }

}

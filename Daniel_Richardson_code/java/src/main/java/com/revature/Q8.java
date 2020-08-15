package com.revature;

import java.util.ArrayList;

import static com.revature.AppDriver.defaults;

public class Q8 {
    //Q8. Write a program that stores the following strings in an ArrayList and
    // saves all the palindromes in another ArrayList.
    //
    //“karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”

    private ArrayList<String> aList = new ArrayList<>();
    private ArrayList<String> palinList = new ArrayList<>();

    public Q8(){
        wordList();
        palinD();
    }
    public void wordList(){
        String[] namesCustom;
        int size;
        if(!defaults){
            System.out.println("Requires an array of names.");
            InputHandler input = InputHandler.getInstance();
            namesCustom = input.strArrayInput();
            for (String name : namesCustom) { //adding array into aList
                this.aList.add(name);
                this.palinList.add(name); //add to both lists
            }
        } else {
            String[] namesPremade = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john", "refer", "billy", "did"};
            for (String name : namesPremade) { //adding array into aList
                this.aList.add(name);
                this.palinList.add(name); //add to both lists
            }
        }
    }

    public void palinD(){
        for (int i = 0;i < this.palinList.size()-1; i++){
            char[] elChArray = this.palinList.get(i).toCharArray();
            int halfPoint = (elChArray.length/2);
            int backCounter = elChArray.length-1;
            for(int w = 0; w < halfPoint; w++){ //tests up to half the size of string
                if(elChArray[w] != elChArray[backCounter]){
                    //System.out.println("removed "+ palinList.get(i)); //for debugging
                    this.palinList.remove(i);
                    break; //super important. if we don't break, elements drop down, and it checks new element
                }
                backCounter--;
            }

        }
        for(String elements : this.palinList){
            System.out.println(elements);
        }


    }

}

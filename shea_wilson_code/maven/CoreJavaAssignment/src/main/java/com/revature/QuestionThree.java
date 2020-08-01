package com.revature;

public class QuestionThree {

    private static final String WHITESPACE = " ";

    public static String reverse(String str){

        String[] words = str.split(WHITESPACE); // split the string into an array of words using whitespace as a delimiter
        StringBuilder revString = new StringBuilder();

        for (String word : words) {
            StringBuilder revWord = new StringBuilder();
            for (int i = word.length()-1 ; i >= 0 ; i--){
                revWord.append(word.charAt(i));
            }
            revString.append(revWord).append(WHITESPACE);
        }
        return revString.toString();
    }

    public static void main(String[] args) {

        String sentence = "Something";
        System.out.println(sentence);
        System.out.println(reverse(sentence));


        //reverse();


    }

}

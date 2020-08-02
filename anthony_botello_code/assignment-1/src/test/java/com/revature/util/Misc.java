package com.revature.util;

import java.util.Random;

public class Misc{

    private static final Random random = new Random();

    /********** int Utility Methods **********/

    // returns a random int
    public static int getRandomInt(){
        return random.nextInt();
    }

    // returns a random int i such that i < max
    public static int getRandomInt(int max){
        return getRandomInt(0, max);
    }

    // returns a random int i such that min <= i < max
    public static int getRandomInt(int min, int max){
        return random.nextInt(max - min) + min;
    }
    

    /********** Array Utility Methods **********/

    // returns an array of random ints of random size such that 0 <= size < 10000
    public static int[] randomIntArray(){
        int size = getRandomInt(10000);
        return randomIntArray(size);
    }

    // returns an array of random ints of fixed size
    public static int[] randomIntArray(int size){
        return randomIntArray(size, Integer.MAX_VALUE);
    }

    // returns an array of random ints of fixed size; for int i of the array, i < maxValue
    public static int[] randomIntArray(int size, int maxValue){
        return randomIntArray(size, 0, maxValue);
    }

    // returns an array of random ints of fixed size; for int i of the array, minValue <= i < maxValue
    public static int[] randomIntArray(int size, int minValue, int maxValue){

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = getRandomInt(minValue, maxValue);
        }

        return arr;
    }
    
    /********** String Utility Methods **********/

    // returns a random UTF-8 character
    private static char getRandomCharacter(){

        int ch;
        do{
            ch = getRandomInt(0x00FF);
        }
        while(Character.isISOControl(ch));

        return (char) ch;
    }

    // returns a random lower case letter
    private static char getRandomLetter(){
        return (char) getRandomInt((int) 'a', (int) 'z' + 1);
    }

    // returns a random non-alphabetic character
    private static char getRandomNonAlphaCharacter(){

        char ch;
        do{
            ch = getRandomCharacter();
        }
        while(Character.isLetter(ch));

        return ch;
    }
    
    // returns a random String of random length such that 0 <= length < 1000
    public static String getRandomString(){

        int length = getRandomInt(1000);

        return getRandomString(length);
    }

    // returns random String of fixed length
    public static String getRandomString(int length){
        
        char[] string = new char[length];

        for(int i = 0; i < length; i++){
            string[i] = getRandomCharacter();
        }
        
        return new String(string);
    }

    // returns a random alphabetic String of random length such that 0 <= length < 1000
    public static String getRandomAlphaString(){

        int length = getRandomInt(1000);

        return getRandomAlphaString(length);
    }

    // returns a random alphabetic String of fixed length
    public static String getRandomAlphaString(int length){

        char[] string = new char[length];

        for(int i = 0; i < length; i++){

            string[i] = getRandomLetter();

            boolean upperCase = random.nextBoolean();
            if(upperCase){
                string[i] = Character.toUpperCase(string[i]);
            }
        }

        return new String(string);
    }

    // returns a random palindrome
    public static String getRandomPalindrome(){

        int length = getRandomInt(100);

        String str = getRandomAlphaString(length/2);
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while(i < str.length()){

            boolean addLetter = random.nextBoolean();
            if(addLetter){
                sb.append(str.charAt(i));
                i++;
            }
            else{
                sb.append(getRandomNonAlphaCharacter());
            }
        }

        i--;

        boolean odd = random.nextBoolean();
        if(odd) i--;

        while(i >= 0){

            boolean addLetter = random.nextBoolean();
            if(addLetter){
                sb.append(str.charAt(i));
                i++;
            }
            else{
                sb.append(getRandomNonAlphaCharacter());
            }

        }

        return sb.toString();
    }

    // returns a random alphabetic palindrome
    public static String getRandomAlphaPalindrome(){
        return getRandomPalindrome().replaceAll("[^A-Za-z]","");
    }
}

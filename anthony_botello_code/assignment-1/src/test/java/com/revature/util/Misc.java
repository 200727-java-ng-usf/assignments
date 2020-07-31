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
    
    // returns a random String of random length such that 0 <= length < 1000
    public static String getRandomString(){
        int length = getRandomInt(1000);
        return getRandomString(length);
    }

    // returns random String of fixed length
    public static String getRandomString(int length){
        
        char[] string = new char[length];

        for(int i = 0; i < length; i++){

            int ch;
            
            do{
                ch = getRandomInt(0x00FF);
            }
            while(ch <= 0x001F || (0x007F <= ch && ch <= 0x009F));

            string[i] = (char) ch;
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

            int n = getRandomInt(26);

            string[i] = (char) ('A' + n);

            if(getRandomInt() % 2 == 0){
                string[i] = (char) (string[i] + ('a' - 'A'));
            }
        }

        return new String(string);
    }

    // public static void main(String[] args){
    //     String testString = Misc.getRandomAlphaString();
    //     String reversedTestString = new String(testString);

    //     // System.out.println(testString);
    //     // System.out.println(reversedTestString);
    //     System.out.println(testString == reversedTestString);
    //     System.out.println(testString.equals(reversedTestString));
    // }
}

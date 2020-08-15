package com.revature.JavaCoreAssign;

//Reverse a string without using a temporary variable.
// Do NOT use reverse() in the
// StringBuffer or the StringBuilder APIs.
public class QuestionThree {

    public static String reverseQ3(String str){
        String reverseMe =" ";

        /**
         *take the last letter and set it to the first and continue looping
         * back to the last position
         * length - 1
         * */
        for (int i = str.length() -1; i >=0; i--){
            reverseMe = reverseMe + str.charAt(i);

        }
         System.out.println(reverseMe);

        return reverseMe;
    };

//    public static void main(String[] args) {
//        reverseQ3("Racecar");
//    }
}

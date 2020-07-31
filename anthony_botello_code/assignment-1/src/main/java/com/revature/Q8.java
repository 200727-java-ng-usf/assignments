package com.revature;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Q8{

    // public static boolean isPalindrome(String str){
    //     int i = 0, j = str.length() - 1;
    //     do{
            
    //         while(!isAlpha(str.charAt(i))) i++;
    //         while(!isAlpha(str.charAt(j))) j--;
            
    //         char front = Character.toLowerCase(str.charAt(i));
    //         char back = Character.toLowerCase(str.charAt(j));

    //         if(front != back) return false;
    //     }
    //     while()
    // }

    // public static boolean isAlpha(char c){
    //     c = Character.toLowerCase(c);
    //     return 'a' <= c && c <= 'z';
    // }

    /* Easy to read, not the most efficient */
    public static boolean isPalindrome(String str){
        
        String s = str.replaceAll("[^A-Za-z]","");
        int n = s.length();

        for(int i = 0; i < n/2; i++){
            
            char front = Character.toLowerCase(str.charAt(i));
            char end = Character.toLowerCase(str.charAt(n - 1 - i));

            if(front != end) return false;
        }
        return true;
    }

    public static void main(String[] args){

        List<String> strings = Arrays.asList("karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john", "refer", "billy", "did");

        List<String> palindromes = strings
                                    .stream()
                                    .filter(s -> isPalindrome(s))
                                    .collect(Collectors.toList());

        System.out.println(palindromes.toString());
    }

}
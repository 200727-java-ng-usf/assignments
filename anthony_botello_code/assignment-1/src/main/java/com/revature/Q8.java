package com.revature;

import java.util.List;
import java.util.stream.Collectors;

public class Q8{

    public static boolean isPalindrome(String str){
        
        String s = str.replaceAll("[^A-Za-z]","");
        
        int i = 0;
        int j = s.length() - 1;

        while (i < j){

            if(s.charAt(i) != s.charAt(j)) return false;

            i++;
            j--;
        }

        return true;
    }

    public static List<String> getPalindromes(List<String> list){
        return list.stream().filter(Q8::isPalindrome).collect(Collectors.toList());
    }
}
package com.revature;

public class Q5{

    public static String substring(String str, int start, int end) 
        throws StringIndexOutOfBoundsException
    {
        
        if(str.equals("")) return str;

        if(end < start || end > str.length()){
            throw new StringIndexOutOfBoundsException();
        }

        int length = end - start;
        char[] substr = new char[length];
        
        for(int i = 0; i < length; i++){
            substr[i] = str.charAt(start + i);
        }

        return String.valueOf(substr);
    }

    public static String substring(String str, int end){
        return substring(str, 0, end);
    }

}
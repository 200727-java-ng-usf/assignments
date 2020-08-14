package com.revature.coreJavaAssign;

public class q5SubToIdx {
    /*
    What is it asking me to do ?
    - it wants me to return a subString(a part of a String )
    -the suString will be in btw 0 and (idx - 1)
    or
     */
    static String q5SubToIdx (int idx,String str){

       //edge casing
        if(idx ==0 ){
            return str;
        }
        if(str == "" ){
            return null;
        }

        int i;
        //char array with the length of the int idx specified
        char[] sString = new char[idx];

        //the iterations is - 1 of the length of str
        for (i = 0;i <= idx - 1;i++){
            //everytime i pass through it will go and equal
            //each index of str to subString until the condition is reached
            sString[i] = str.charAt(i);
        }
        //string initalized with the substring created from loop
        String subString = new String(sString);

        //this will return the substring
        return subString;
    }
}

package com.revature.coreJavaAssign;

public class q3Reverse {
    /*
        What is it asking me to do ?
        -to take in a string and give back the letters
        in reverse order

     */
    static String q3reverse(String reverseString) {
        if(reverseString==null){
            return null;
        }
        // accumulator
        int i;
        //This will give me the length of ReverseString
        int lengthOfString = reverseString.length();

        //This here will convert the string into a charArray
        char[] chars = new char[lengthOfString];

      // System.out.println("This is the length of the array: " + chars.length);// The answer is 13
//          this was the method when i just printed a char[] reversed
//        //the iterations is - 1 of the length of ReverseString
//        for ( i = lengthOfString - 1; i >= 0; i--) {
//            //This will print all the chars starting at the 12th array spot moving backwards
//            System.out.print(chars[i]);
//        }
        //i will iterate the length of the string given
        for( i = 0;i < lengthOfString ;i++){
            //in the brackets it will start at index 12 and place the first letter of the string
            //and while the index continues to go down the string letter will iterate through
          chars[lengthOfString - i - 1] = reverseString.charAt(i);
        }
        // converts the char[] into a string
        String reverse =  String.valueOf(chars);
        return reverse;
    }
}

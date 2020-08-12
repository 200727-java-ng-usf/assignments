package com.revature;
public class Q3 {

    public String reverseMethod(StringBuilder sb)
    {
        //System.out.println(sb);	//i.e.passed String  "abc"
        int initialLength = sb.length(); //3: a=[0], b=[1], c=[2]
        final int LAST_INDEX= initialLength - 1; //[2] constant to delete half of mirrored string

        /*
         * appends a reverse copy at the beginning
         * for example: "abc", the LAST_INDEX character copied into position i++,
         *  becoming cba.The result is a mirrored string: "cbaabc"
         * */
        for(int i = 0; i < initialLength; i++ )
            sb.insert(i, sb.charAt(LAST_INDEX)); // LAST_INDEX constant to delimit size
        //System.out.println(sb);


        /*
         *  Deletes the original (not reversed) copy, the second half
         * */
        for(int i = 0; i < initialLength; i++ )
            sb.deleteCharAt(initialLength); // "cbaabc"
        //System.out.println(sb);

        // toString() needed, otherwise it cannot convert from StringBuilder to String
        return(sb.toString()); // returns a string
    }

//		public static void main(String[] args) {
//			Q3b q3b = new Q3b(); // instantiating creating a class object
//			StringBuilder sb = new StringBuilder("Hello ");  // creating the string
//			q3b.reverseMethod(sb); // reverse the string
//			System.out.println("in main" + sb);
//
//	}

}

//
//public class Q3 {
//    public String reverseString(String str) {
//        System.out.println("Before reversing " + str);
//        // save the string length for future use.
//        int stringLength = str.length();      // If "abc", length = 3
//        int startingIndex = stringLength - 1;  // If "abc", startingIndex = 2
//
//
//        // Create a char array of str.length() characters.
//        // ... Add all letters to it.
//        char[] reverseStr = new char[stringLength];
//
//        //reverses the order of the char list
//        // starting from the highest index: startingIndex
//        /** charAt(int index) method returns the character at the specified index in a string.
//         The index value that we pass in this method should be between 0 and (length of string-1) */
//        for (int i = startingIndex; i > -1; i--) {
//            reverseStr[startingIndex - i] = (str.charAt(i));    // returns character from highest index to lower
//        }
//
//        //puts reversed char list back into a string
//        System.out.println("from Q3");
//        System.out.println(String.valueOf(reverseStr));
//        System.out.println("end Q3, now return string");
//        return str;
//    }
//}

package com.revature;
public class Q3 {
    /**
     *Q3. Reverse a string without using a temporary variable.
     * Do NOT use reverse() in StringBuffer or the StringBuilder APIs.
     *
     * @param sb to be reversed
     * @return a StringBuilder object that is reversed, otherwise
     */
    public String reverseMethod(StringBuilder sb)
    {
        int initialLength = sb.length(); //if "abc" 3: a=[0], b=[1], c=[2]
        final int LAST_INDEX= initialLength - 1; //[2] constant to delete half of mirrored string

        /*
         * appends a reverse copy at the beginning
         * for example: "abc", the LAST_INDEX character 'c' copied into position 0 and so on,
         *  becoming "cba" The rest are pushed to the right, resulting in a mirrored string: "cbaabc"
         * */
        for(int i = 0; i < initialLength; i++ )
            sb.insert(i, sb.charAt(LAST_INDEX)); // LAST_INDEX constant to delimit size

        /*
         *  Deletes the original (not reversed) copy, the second half
         * */
        for(int i = 0; i < initialLength; i++ )
            sb.deleteCharAt(initialLength); // "cbaabc"


        return(sb.toString()); // toString() needed, to convert from StringBuilder to String
    }

//		public static void main(String[] args) {
//			Q3 q3 = new Q3(); // instantiating creating a class object
//			StringBuilder sb = new StringBuilder("Hello ");  // creating the string
//			q3.reverseMethod(sb); // reverse the string
//			System.out.println("in main" + sb);
//	}
}
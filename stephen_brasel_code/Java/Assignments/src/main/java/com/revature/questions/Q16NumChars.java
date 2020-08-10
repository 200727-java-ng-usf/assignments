package com.revature.questions;

/**
 * A <code>Q16NumChars</code> determines the number of chars in a <code>{@link String}</code>.
 * @author stephen.brasel@gmail.com
 */
public class Q16NumChars {
//    Q16. Write a program to display the number of characters for a string input.
//    The string should be entered as a command line argument using (String [ ] args).
    /**
     * The length of the input <code>{@link String}</code>[]'s 0th index <code>{@link String}</code>
     * If there is no String at index 0, this is 0;
     */
    private static int len = 0;

    /**
     * The length of the input <code>{@link String}</code>[]'s 0th index <code>{@link String}</code>
     * If there is no String at index 0, this is 0;
     * @return the length of the input <code>{@link String}</code>[]'s 0th index <code>{@link String}</code><br>
     *     if there is no String at index 0, returns 0.
     */
    public static int getLen() {
        return len;
    }

    /**
     * Prints the length of the first <code>{@link String}</code> in the <code>{@link String}</code>[] {@code args},
     * if {@code args} is empty, does nothing.
     * @param args Command Line Arguments <code>{@link String}</code>[], i.e. <br><br>
     * <code>java Q16NumChars main schadenfreude</code><br><br>
     * prints out:<br><br>
     * <code>13</code>
     */
    public static void main(String[] args){
        if(args.length > 0){
            len = args[0].length();
            System.out.print(len);
        }
    }
}

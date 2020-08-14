import java.util.Scanner;

/**
 * This class has a method that reverses a string and a main
 * method which calls the reverseIt method.
 */
public class Q3ReverseString {

    /**
     * The reverseIt method takes in a string and returns a new
     * string that is the reverse of the original.
     * @param str
     * @return
     */
    public static String reverseIt(String str) {
        /**
         * Initialize an empty String.
         */
        String rev = "";
        /**
         * Parse through the entire string from length-1,
         * which is the last index position to index position 0.
         */
        for(int i = str.length() -1; i >= 0; i--) {
            /**
             * concatenate the String with the characters from
             * end to beginning so that it will be the reverse of the
             * original string
             */
            rev += str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {

        /**
         * Asks the user for a word.
         */
        System.out.print("Enter your word: ");

        /**
         * Creates a Scanner object to take input from the console.
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Assigns the input to a String object.
         */
        String userString = scanner.nextLine();
        /**
         * Calls the method and prints the result.
         */
        System.out.println("Here is your word reversed: " + reverseIt(userString));

    } // end main

} // done
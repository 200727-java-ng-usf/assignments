import java.util.Scanner;

/**
 * This class has a method that truncates a string to a specified length and
 * a main method which calls the substring method.
 */
public class Q5Substring {

    /**
     * The substring method takes in a String and index position
     * and returns a new String shortened to the specified length.
     * @param str
     * @param idx
     * @return
     */
    public static String substring(String str, int idx) {

        /**
         * Initialize a String to hold the return String.
         */
        String result = "";

        /**
         * From index position 0 to idx-1, concatenate the
         * return String with the character at str's index.
         */
        for(int i = 0; i < idx; i++) {
            result = result.concat(String.valueOf(str.charAt(i)));
        }
        return result;
    }

    public static void main(String[] args) {

        /**
         * Asks the console for a word.
         */
        System.out.print("Enter your word: ");

        /**
         * Creates a Scanner object to take input from the console.
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Assigns the input to a String and then an integer reference.
         */
        String yourWord = scanner.next();
        System.out.print("Enter the number of letters from the word that you would like to be displayed: ");
        int yourNumber = scanner.nextInt();

        /**
         * Calls the substring method and prints the result.
         */
        System.out.println("Here is the first " + yourNumber + " letters of " + yourWord + ": " + substring(yourWord, yourNumber));

    } // end main

} // end class
// done
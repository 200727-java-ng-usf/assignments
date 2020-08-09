import java.util.Scanner;

/**
 * This class takes in a string input from the user and returns the reversed string.
 */
public class QuestionThree {

    // Method that takes in a string and returns a string
    public static String reverseIt(String str) {
        String rev = "";
        for(int i = str.length() -1; i >= 0; i--) {

            rev += str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {

        // Ask the user for a word to reverse
        System.out.print("Enter your word: ");

        // Create a Scanner object to take in user input
        Scanner scanner = new Scanner(System.in);

        // Assign the string to a String object
        String userString = scanner.nextLine();

        // Run the method
        System.out.println("Here is your word reversed: " + reverseIt(userString));

    }

} // done
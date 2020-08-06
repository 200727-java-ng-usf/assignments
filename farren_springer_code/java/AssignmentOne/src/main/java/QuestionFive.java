import java.util.Scanner;

public class QuestionFive {

    // Create a method that creates a substring from a string to a specified char index
    static String substring(String str, int idx) {

        // result string
        String result = "";
        for(int i = 0; i < idx; i++) {
            result = result.concat(String.valueOf(str.charAt(i)));
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {

        // Take in a value from the scanner
        System.out.print("Enter your word: ");

        // Create a Scanner object to take in user input
        Scanner scanner = new Scanner(System.in);

        // Assign user input to the corresponding fields
        String yourWord = scanner.next();
        System.out.print("Enter the number of letters from the word that you would like to be displayed: ");
        int yourNumber = scanner.nextInt();

        // Call substring method
        System.out.println("Here is the first " + yourNumber + " letters of " + yourWord + ": " + substring(yourWord, yourNumber));

    }
} // done
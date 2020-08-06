import java.util.Scanner;

public class QuestionSixteen {

    // Create a method that returns an integer
    static int numberOfCharactersInString(String str) {
        int result = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                result++;
            }
        }
        return result;
    }

    // Call the method in the main method
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their string
        System.out.print("What is your string: ");

        // Assign the user input to the correct field
        String userString = scanner.nextLine();

        // Call the method
        System.out.println("Your string has " + numberOfCharactersInString(userString) + " characters.");

    } // end main
} // end class

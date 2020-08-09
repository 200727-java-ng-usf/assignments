import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class QuestionFourteen {

    /**
     * This method asks the user for input and returns the square root.
     */
    public static double squareRoot() {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.println("Enter a number: ");

        // Take the user input as the number to square root
        int num = scanner.nextInt();

        // Take the square root
        double result = Math.sqrt(num);

        // Show the user the result
        System.out.println("Here is the square root of that number: " + result);

        // return the result
        return result;
    }

    /**
     * This method returns the date as a string.
     * @return
     */
    public static String printTheDate() {

        // Find the date and store it in result as a string
        String result = String.valueOf(LocalDateTime.now());

        // Show the user the result
        System.out.println("Here is the date: " + result);

        // return the result
        return result;
    }

    /**
     * This method takes a string and splits it into a string array, delimited by a space.
     * @param str
     * @param delimitor
     * @return
     */
    public static String[] splitTheString(String str, String delimitor) {

        // The string to be split
        str = "I am learning Core Java";

        // Split the string
        String[] splitStringArray = str.split(delimitor);

        // Show the user the result
        System.out.println("The string has been split into a string array: " + Arrays.toString(splitStringArray));

        // return the result
        return splitStringArray;
    }

    /**
     * The main method contains the switch case, which calls one of the three methods depending on the case.
     * @param args
     */
    public static void main(String[] args) {

        // Explain what the method will do
        System.out.println("Case 1 will find the square root of a number.");
        System.out.println("Case 2 will print the date and time.");
        System.out.println("Case 3 will split the string: 'I am learning Core Java.'");

        // Ask the user for input
        System.out.println("\nWhich case would you like to execute? Enter 1, 2, or 3: ");

        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Assign the user input to the case number
        int theCaseNumber = scanner.nextInt();

        // Use the case number to decide what case to run
        switch (theCaseNumber) {
            case 1:
                squareRoot();
                break;
            case 2:
                printTheDate();
                break;
            case 3:
                splitTheString("I am learning Core Java", " ");
                break;
        }

    } // end main

} // end class
// done



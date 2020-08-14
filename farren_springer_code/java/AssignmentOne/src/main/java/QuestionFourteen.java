import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Arrays;
import java.util.Scanner;

public class QuestionFourteen {

    /**
     * This method asks the user for input and returns the square root.
     */
    public static double squareRoot( int num) {

        // Check for negative number
        if (num < 0) {
            throw new ArithmeticException("Invalid input");
        }

        /**
         * Use the Math class to find the square root of the number.
         */
        double result = Math.sqrt(num);

        /**
         * Show the result to the user.
         */
        System.out.println("Here is the square root of that number: " + result);

        /**
         * Return the result.
         */
        return result;
    }

    /**
     * This method returns the date as a string.
     * @return
     */
    public static String printTheDate() {

        /**
         * Create a SimpleDateFormat object and establish a pattern for the date.
         */
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        /**
         * Create a date object.
         */
        Date date = new Date();

        /**
         * Display the result to the console.
         */
        System.out.println("Here is the current date: " + formatter.format(date));

        /**
         * Return the date.
         */
        return formatter.format(date);

    }

    /**
     * This method takes a string and splits it into a string array, delimited by a space.
     * @param str
     * @param delimitor
     * @return
     */
    public static String[] splitTheString(String str, String delimitor) {

        /**
         * Assign the string to the string asked for by the question.
         */

        /**
         * Split the string into an array of strings.
         */
        String[] splitStringArray = str.split(delimitor);

        /**
         * Display the result.
         */
        System.out.println("The string has been split into a string array: " + Arrays.toString(splitStringArray));

        /**
         * Return the result.
         */
        return splitStringArray;
    }

    /**
     * The main method contains the switch case, which calls one of the three methods depending on the case.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Print the description of the program to the console.
         */
        System.out.println("Case 1 will find the square root of a number.");
        System.out.println("Case 2 will print the date and time.");
        System.out.println("Case 3 will split the string: 'I am learning Core Java.'");

        /**
         * Ask for user input to chose which case will run.
         */
        System.out.println("\nWhich case would you like to execute? Enter 1, 2, or 3: ");

        /**
         * Create a Scanner object to take in user input.
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Assign the user input to the variable that will be used as a case number.
         */
        int theCaseNumber = scanner.nextInt();

        /**
         * Use the case number from the user as the parameter for the switch case.
         */
        switch (theCaseNumber) {
            case 1:
                /**
                 * Create a Scanner object.
                 */
                Scanner scannerCase1 = new Scanner(System.in);

                /**
                 * Ask for user input.
                 */
                System.out.println("Enter a number: ");

                /**
                 * Assign the input to an integer variable.
                 */
                int num = scannerCase1.nextInt();
                squareRoot(num);
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



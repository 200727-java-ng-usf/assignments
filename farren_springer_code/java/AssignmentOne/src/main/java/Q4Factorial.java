import java.util.Scanner;
/**
 * This class has a method that computes n factorial and a main
 * method which calls the factorial method.
 */
public class Q4Factorial {

    /**
     * The factorial method takes in an integer and returns the
     * integer's factorial.
     * @param n
     * @return
     */
    public static int factorial(int n) {

        /**
         * Initialize an array to hold descending values from n.
         */
        int[] n_descending = new int[n];

        /**
         * Store each consecutive descending number in an integer array.
         */
        for (int i = 0; i < n_descending.length; i++) {
            n_descending[i] = i + 1;
        }
        /**
         * Instantiate a variable to hold the return value.
         */
        int ans = 1;

        /**
         * Multiply all the descending numbers.
         */
        for(int r = n_descending.length; r > 0; r--) {
            ans *= r;
        }
        return ans;

    } // end factorial method

    public static void main(String[] args) {

        /**
         * Asks the user for a word.
         */
        System.out.print("Enter your integer: ");

        /**
         * Creates a Scanner object to take input from the console.
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Assigns the input to an integer reference.
         */
        int yourNumber = scanner.nextInt();

        /**
         * Calls the factorial method and prints the result.
         */
        System.out.println("Here is " + yourNumber + " factorial: " + factorial(yourNumber));

    } // end main

} // end class
// done

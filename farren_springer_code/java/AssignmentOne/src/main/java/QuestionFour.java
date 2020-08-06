import java.util.Arrays;
import java.util.Scanner;

public class QuestionFour {

    // Create a method that takes an integer parameter and returns the factorial
    public static int factorial(int n) {

        // find all numbers that descend from N
        int[] n_descending = new int[n];

        // store those numbers in the array
        for (int i = 0; i < n_descending.length; i++) {
            n_descending[i] = i + 1;
        }
        // create a variable to store the ans
        int ans = 1;

        //multiply the numbers
        for(int r = n_descending.length; r > 0; r--) {
            ans *= r;
        }
        return ans;

    } // end method

    public static void main(String[] args) {

        // Ask the user for input
        System.out.print("Enter your integer: ");

        // Create a scanner object to hold user input
        Scanner scanner = new Scanner(System.in);

        // Take in the user input into yourNumber
        int yourNumber = scanner.nextInt();

        // Run the method
        System.out.println("Here is " + yourNumber + " factorial: " + factorial(yourNumber));

    } // end main

} // end class
// done

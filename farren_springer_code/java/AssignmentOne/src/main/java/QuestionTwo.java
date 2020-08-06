import java.util.Arrays;
import java.util.Scanner;

public class QuestionTwo {

    // Display the first 25 Fibonacci numbers
    // Fibonacci numbers are found by adding the last two numbers in the sequence,
    // starting with 0 and 1.

    // Define a method that has a class scope (static), returns an integer array, and
    // takes an int as a parameter. This int will be the number of Fibonacci numbers
    // the method will return.

    static int[] fibonacciGenerator(int numberOfNumbers) {

        // Instantiate an int array of the size specified in the parameter
        int[] fibonacciArray = new int[numberOfNumbers];

        // Initialize the first two numbers in the sequence.
        int now = 1;
        int then = 0;

        // The first two numbers are always 0 and 1
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;

        // Initialize a new variable that the then variable can be stored in.
        int thenthen;

        // Parse through and add the previous two numbers in the sequence.
        for (int i = 2; i < numberOfNumbers; i++) {
            thenthen = then;
            then = now;
            now = thenthen + then;
            fibonacciArray[i] = now;
        }
        System.out.print("Here are the first " + numberOfNumbers + " Fibonacci numbers: ");
        return fibonacciArray;
    } // end method

    // Main method to call the function
    public static void main(String[] args) {

        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the number of numbers they want to see
        System.out.println("How many Fibonacci numbers do you want to see: ");

        // Store the user's number in userNumber
        int userNumber = scanner.nextInt();

        // Call the method using the userNumber
        System.out.println(Arrays.toString(fibonacciGenerator(userNumber)));

        } // end main
    } // end class
// done

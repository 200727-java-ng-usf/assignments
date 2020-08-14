import java.util.Arrays;

/**
 * This class has a method that generates a user-defined number
 * of fibonacci numbers and a main method to call for user input.
 */

public class Q2Fibonacci {

    /**
     * This method generates the fibonacci numbers.
     * @param numberOfNumbers
     * @return
     */
    public static int[] fibonacciGenerator(int numberOfNumbers) {

        /**
         * Instantiate an int array of the size specified in the parameter.
         */
        int[] fibonacciArray = new int[numberOfNumbers];

        /**
         * Initialize the first two numbers in the sequence.
          */

        int now = 1;
        int then = 0;

        /**
         * The first two numbers are 0 and 1.
         */
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;

        /**
         * Initialize a new variable that the then variable can be stored in.
         */
        int thenthen;

        /**
         * Parse through and add the previous two numbers in the sequence.
         */
        for (int i = 2; i < numberOfNumbers; i++) {
            thenthen = then;
            then = now;
            now = thenthen + then;
            fibonacciArray[i] = now;
        }
        return fibonacciArray;
    } // end method

    /**
     * The main method uses try-catch blocks to catch invalid user input.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Calls the FibonacciGenerator method.
         * Uses toString method to print the contents
         * of the array from the wrapper class.
         */
        System.out.print("Here are the first 25 Fibonacci numbers: "
                + Arrays.toString(fibonacciGenerator(25)));



        } // end main

    } // end class
// done

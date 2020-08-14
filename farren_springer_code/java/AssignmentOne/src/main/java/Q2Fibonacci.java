import java.util.Arrays;

/**
 * This class has a method that generates any number
 * of fibonacci numbers and a main method calls the
 * method for the first 25 numbers..
 */

public class Q2Fibonacci {

    /**
     * To generate fibonacci numbers, this method takes an integer and returns
     * an integer array of that length filled with fibonacci numbers, starting at 0
     * @param numberOfNumbers
     * @return
     */
    public static int[] fibonacciGenerator(int numberOfNumbers) {

        int[] fibonacciArray = new int[numberOfNumbers];

        int currentIndex = 1;
        int previousIndex = 0;

        /**
         * The first two numbers are 0 and 1.
         */
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;

        /**
         * Initialize a new variable that the then variable can be stored in.
         */
        int furtherPreviousIndex;

        // currentIndex, previousIndex, furtherPreviousIndex

        /**
         * Parse through and add the previous two numbers in the sequence.
         */
        for (int i = 2; i < numberOfNumbers; i++) {
            furtherPreviousIndex = previousIndex; // index positions shift forward
            previousIndex = currentIndex;
            currentIndex = furtherPreviousIndex + previousIndex;
            fibonacciArray[i] = currentIndex;
        }
        return fibonacciArray;
    } // end method

    /**
     * The main method calls the fibonacciGenerator method.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Uses toString method to print the contents
         * of the array from the wrapper class.
         */
        System.out.print("Here are the first 25 Fibonacci numbers: "
                + Arrays.toString(fibonacciGenerator(25)));



        } // end main

    } // end class
// done

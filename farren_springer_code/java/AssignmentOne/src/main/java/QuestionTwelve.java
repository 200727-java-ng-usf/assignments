import java.util.Arrays;

/**
 * This class has a method, arrayOperations, that prints all even numbers in an array of integers and
 * a main method that demonstrates the use of arrayOperations.
 */
public class QuestionTwelve {

    /**
     * The arrayOperations method has an integer parameter to specify the length of the array and
     * returns the even numbers.
     * @param length
     * @return
     */
    public static void arrayOperations (int length){

        /**
         * This declares an integer array of a length specified by the method implementation.
         */
        int[] theIntArray = new int[length];

        /**
         * Parse through the array and store consecutive values.
         */
        for(int i = 1; i < theIntArray.length + 1; i++) {
            theIntArray[i-1] = i;
        }

        /**
         * Print the original array to the console.
         */
        System.out.println("Here is the 100 array filled with numbers 1 through 100: " + Arrays.toString(theIntArray)); // test

        /**
         * Print the even numbers to the console.
         */
        System.out.print("Here is a list of the even numbers in the array: ");
        for(int i : theIntArray) {
            /**
             * If the integer at each index divided by two has a zero remainder, print it.
             */
            if(theIntArray[i-1]%2 == 0){

                System.out.print(theIntArray[i-1]);

            }
            else {
                /**
                 * This puts space where there would be an odd number.
                 */
                System.out.print(" ");
            }
        }

    } // end arrayOperations

    /**
     * The main method will demonstrate the use of the arrayOperations method.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Pass 100 as the integer parameter of the method.
         */
        arrayOperations(100);

    } // end main

} // end class
// done
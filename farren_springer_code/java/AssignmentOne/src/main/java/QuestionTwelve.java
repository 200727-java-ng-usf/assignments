import java.util.Arrays;

public class QuestionTwelve {

    // Method that takes in a number that is the length of the array
    public static int[] arrayOperations (int length){

        // Create an int array with length specified
        int[] theIntArray = new int[length];

        // store 1 through 100 in the array
        for(int i = 1; i < 101; i++) {
            theIntArray[i-1] = i;
        }

        System.out.println("Here is the 100 array filled with numbers 1 through 100: " + Arrays.toString(theIntArray)); // test

        // print the even numbers
        System.out.print("Here is a list of the even numbers in the array: ");
        for(int i : theIntArray) {
            // iterate through numbers 2 through 50; divide the number
            // in every index of hundred array to check if it
            // can be factored by that number
            if(theIntArray[i-1]%2 == 0){

                System.out.print(theIntArray[i-1]);

            }
            else {
                System.out.print(" ");
            }
        }

        // Return the array
        return theIntArray;
    }

    // Main method
    public static void main(String[] args) {

        arrayOperations(100);

    } // end main

} // end class
// done
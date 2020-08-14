import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class has a method, arrayOperations, that prints all even numbers in an array of integers and
 * a main method that demonstrates the use of arrayOperations.
 */
public class Q12EnhancedForLoop {

    /**
     * The arrayOperations method has an integer parameter to specify the length of the array and
     * returns the even numbers.
     * @param length
     * @return
     */
    public static int[] arrayOperations (int length){

        /**
         * This declares an integer array of a length specified by the method implementation. We also
         * declare an ArrayList object that will hold the even numbers. Since this must be dynamically
         * sizeable, we make an ArrayList rather than an array. Next, we initialize a counter integer
         * variable that will increment when we find an even number in the integer array to 0.
         * This counter will be used to show the length of the integer array.
         */
        int[] theIntArray = new int[length];
        ArrayList<Integer> resultArrayList = new ArrayList<>();
        int countNumberOfEvenNumbers = 0;

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
        System.out.print("Here are the even numbers in the array: ");

        for(int i : theIntArray) {
            /**
             * If the integer at each index divided by two has a zero remainder, increment the counter and
             * add the even number to the resultArrayList.
             */
            if(theIntArray[i-1]%2 == 0){
                countNumberOfEvenNumbers++;
                resultArrayList.add(theIntArray[i-1]);
            }
        }

        /**
         * Initialize a result integer array to the length of the number of even numbers to return it
         * to the method.
         */
        int[] resultArray = new int[countNumberOfEvenNumbers];

        /**
         * For each element in resultArrayList,
         */
        for(int i = 0; i < countNumberOfEvenNumbers; i++) {
            resultArray[i] = resultArrayList.get(i);
            System.out.print(resultArray[i] + " ");
        }

        /**
         * Return the resultArray.
         */
        return resultArray;



    } // end arrayOperations

    /**
     * The main method will call the arrayOperations method.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Pass 100 as the integer parameter of the method.
         */
        try {
            arrayOperations(100);
        } catch (NullPointerException npe) {
            npe.printStackTrace();
            System.out.println("Null Pointer exception!");
        }


    } // end main

} // end class
// done
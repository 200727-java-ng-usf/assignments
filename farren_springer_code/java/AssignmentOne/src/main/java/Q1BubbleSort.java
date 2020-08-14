import java.util.Arrays;

public class Q1BubbleSort {

    /**
     * This method performs a bubble sort on an integer array and returns the
     * new sorted integer array.
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {

        /**
         * Instantiate a temporary variable.
         */
        int temp;

        /**
         * Use loops to compare the integers in the array.
          */
        for (int i = arr.length - 1; i > 0; i--) {
            /**
             * For each index value, compare it to each other value in the array
             */
            for (int j = 0; j < i; j++) {
                // If the current array index value is greater
                if (arr[j] > arr[j + 1]) {
                    // Then store that in a temporary location,
                    temp = arr[j];
                    // Move the compared value to the location it was compared to,
                    arr[j] = arr[j + 1];
                    // And assign the temp variable that held the greater value to its rightful place ahead of the other
                    arr[j + 1] = temp;
                }
                // if the current array index is not greater, continue the for loop
            }
        }
        /**
         * Return the sorted integer array.
         */
        return arr;
    }

    public static void main(String[] args) {

        /**
         * Instantiate the integer array from Q1.
         */
        int someInts[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};

        /**
         * Print the unsorted array.
         */
        System.out.println("This is the unsorted array: " + Arrays.toString(someInts) + "\n");


        /**
         * Print the array returned from the bubbleSort method.
         */
        System.out.print("This is the bubble sorted array: ");
        System.out.println(Arrays.toString(bubbleSort(someInts)));

    } // end main

} // end class
// done
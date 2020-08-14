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
         * If the array is empty, throw a new NullPointerException.
         */
        if (arr == null) {
            throw new NullPointerException("input is empty");
        }

        int temporaryValueHolder;

        /**
         * To compare the numbers, we start at the first index position and
         * go through every position in the array.
          */
        for (int indexPosition = 0; indexPosition < arr.length; indexPosition++) {
            /**
             * To compare each position, we start with the current index position + 1 and
             * go through every position ahead of it.
             */
            for (int otherIndexPosition = indexPosition + 1; otherIndexPosition < arr.length; otherIndexPosition++) {
                // If the other array index value is greater than the previous
                if (arr[otherIndexPosition] < arr[indexPosition]) {
                    // Then store that in a temporary location,
                    temporaryValueHolder = arr[indexPosition];
                    // Move the compared value to the location it was compared to,
                    arr[indexPosition] = arr[otherIndexPosition];
                    // And assign the temp variable that held the greater value to its rightful place ahead of the other
                    arr[otherIndexPosition] = temporaryValueHolder;
                }
                // if the next array index is not smaller, do nothing and continue the for loop
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int unsortedIntArray[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};

        System.out.println("This is the unsorted array: " + Arrays.toString(unsortedIntArray) + "\n");

        System.out.print("This is the bubble sorted array: ");
        System.out.println(Arrays.toString(bubbleSort(unsortedIntArray)));

    } // end main

} // end class
// done
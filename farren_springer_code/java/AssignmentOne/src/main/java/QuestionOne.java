import java.util.Arrays;

public class QuestionOne {

    public static int[] bubbleSort(int[] arr) {

        // Create a temporary int variable to store for comparisons
        int temp;

        // Use loops to compare the integers in the array
        for (int i = arr.length - 1; i > 0; i--) {
            // For each index value, compare it to each other value in the array
            for (int j = 0; j < i; j++) {
                // If the current array index value is greater
                if (arr[j] > arr[j + 1]) {
                    // Then store that in a temporary location
                    temp = arr[j];
                    // Move the compared value to the location it was compared to
                    arr[j] = arr[j + 1];
                    // Assign the temp variable that held the greater value to its rightful place
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // Establish the string to be used from the worksheet
        int someInts[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};

        // Print the unsorted array
        System.out.println("This is the unsorted array: " + Arrays.toString(someInts) + "\n");
        System.out.print("This is the bubble sorted array: ");

        // Print the bubble sorted array
        System.out.println(Arrays.toString(bubbleSort(someInts)));

    } // end main
} // end class
// done
import java.util.Arrays;

public class QuestionOne {

    public static void main(String[] args) {
        // Establish the string to be used from the worksheet
        int someInts[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};

        // Create a temporary int variable to store for comparisons
        int temp;

        // Print the unsorted array
        System.out.println("This is the unsorted array: " + Arrays.toString(someInts) + "\n");
        System.out.print("This is the bubble sorted array: ");

        // Use loops to compare the integers in the array
        for (int i = someInts.length - 1; i > 0; i--) {
            // For each index value, compare it to each other value in the array
            for (int j = 0; j < i; j++) {
                // If the current array index value is greater
                if (someInts[j] > someInts[j + 1]) {
                    // Then store that in a temporary location
                    temp = someInts[j];
                    // Move the compared value to the location it was compared to
                    someInts[j] = someInts[j + 1];
                    // Assign the temp variable that held the greater value to its rightful place
                    someInts[j + 1] = temp;
                }
            }
        }

        // Print the bubble sorted array
        System.out.println(Arrays.toString(someInts));

    } // end main
} // end class
// done
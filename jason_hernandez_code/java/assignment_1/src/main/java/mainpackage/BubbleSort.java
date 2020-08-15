package mainpackage;

import java.util.Arrays;

public class BubbleSort {

    // Declare an array
    int [] bubbleArray;
    // Instantiate a bubbleSort
    public int[] bubbleSort() {

        // Initialize declared array
        bubbleArray = new int[11];
                // Set initial values as instructed
        bubbleArray = new int[]{1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
        System.out.println("Array Before Bubble Sort: " + Arrays.toString(bubbleArray));

        // Check for edge cases -- not technically needed with a hard coded arr, but good general practice
        if (bubbleArray == null || bubbleArray.length == 0) {
            return new int[0];
        }

        // Copy original array
        int[] number = Arrays.copyOf(bubbleArray, bubbleArray.length);

        int n = bubbleArray.length;

        // Must compare each number and determine if < or > previous
        // If < previous, switch them; if > previous, do not
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++)
                if (number[j] > number[j + 1]) {
                    if(number[j] > number[j + 1]) {
                    int placeholder = number[j];
                    number[j] = number[j + 1];
                        number[j + 1] = placeholder;
                    }
                }

        }
        System.out.println("Array After Bubble Sort: " + Arrays.toString(number));
        return number;

    }
}
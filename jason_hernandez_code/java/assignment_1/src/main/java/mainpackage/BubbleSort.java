package mainpackage;

import java.util.Arrays;

public class BubbleSort {

    // Instantiate a bubbleSort
    public int[] bubbleSort(int[] arr) {
        // Set initial values as instructed
        arr = new int[]{1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
        System.out.println("Array Before Bubble Sort: " + arr);

        // Check for edge cases -- not technically needed with a hard coded arr, but good general practice
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        // Copy original array
        int[] number = Arrays.copyOf(arr, arr.length);

        int n = arr.length;

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
        System.out.println("Array After Bubble Sort" + number);
        return number;

    }
}
package mainpackage;

import java.util.Arrays;

public class BubbleSort {

    // First, set up an array with literals hard coded
    int[] bubbleSorts = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};

    // Instantiate a bubbleSort
    void bubbleSort() {
        int n = bubbleSorts.length;
        int number = 0;
        // Must compare each number and determine if < or > previous
        // If < previous, switch them; if > previous, do not
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < bubbleSorts.length; j++)
                if (bubbleSorts[j] > bubbleSorts[j + 1]) {
                    number = bubbleSorts[j];
                    bubbleSorts[j] = bubbleSorts[j + 1];
                    bubbleSorts[j + 1] = number;
                }
        }
        // Print out the new array
        System.out.println(bubbleSorts);
    }

    @Override
    public String toString() {
        return "BubbleSort{" +
                "bubbleSorts=" + Arrays.toString(bubbleSorts) +
                '}';
    }

}
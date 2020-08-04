package mainpackage;

import java.util.Arrays;

public class BubbleSort {

    // First, set up an array with literals hard coded
    int[] bubbleSorts = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};

//    public void setBubbleSorts(int[] bubbleSorts) {
//        this.bubbleSorts = bubbleSorts;
//    }

    @Override
    public String toString() {
        return "BubbleSort{" +
                "bubbleSorts=" + Arrays.toString(bubbleSorts) +
                '}';
    }

    // Instantiate a bubbleSort
    public void bubbleSort() {
        int n = bubbleSorts.length;
        int number = 0;
        // Must compare each number and determine if < or > previous
        // If < previous, switch them; if > previous, do not
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < bubbleSorts.length-1; j++)
                if (bubbleSorts[j] > bubbleSorts[j + 1]) {
                    number = bubbleSorts[j];
                    bubbleSorts[j] = bubbleSorts[j + 1];
                    bubbleSorts[j + 1] = number;
                }

        }

    }

    public int[] getBubbleSorts() {
        return bubbleSorts;
    }
    public static void main(String[] args) {
        System.out.println("1. Bubble Sort an array");
        System.out.println("Array Before Bubble Sort");
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort();

        System.out.println("Array After Bubble Sort");
        System.out.println(bubbleSort);
    }
}
package assignment.questions;

import java.util.Arrays;

public class Q1 {
    public void bubbleSort(int[] arr) {
        //makes sure to go through the entire array
        for (int i = 0; i < arr.length-1; i++) {
            //checks to see if a number on the left is bigger than on the right
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public void sortArray(int arr[]) {
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

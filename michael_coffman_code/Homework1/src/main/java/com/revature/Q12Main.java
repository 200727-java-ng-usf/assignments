package com.revature;

import java.util.Arrays;

public class Q12Main {

    // Initiating int[]
    public int[] arr = new int[100];

    // Empty constructor, for practice purpose
    public Q12Main(){
        super();
    }

    // This method iterates the index of int[] arr, and assigns i+1 value
    public void createArray() {
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
    }

    // Enhanced-For loop to print even-only numbers
    public void printEvenNumbers() {

        int indexCount = 0;
        for (int evenNum : arr) {
            if (evenNum % 2 == 0) {
                System.out.println(evenNum);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Taken from int[] arr, the even numbers are: ");
        Q12Main array = new Q12Main();

        array.createArray();

        // Display entire int[]
        System.out.println(Arrays.toString(array.arr));
        array.printEvenNumbers();


    }

}

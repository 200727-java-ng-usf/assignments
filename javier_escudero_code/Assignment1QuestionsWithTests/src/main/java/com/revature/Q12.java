package com.revature;

public class Q12 {

    static int arr[];
    static Q12 q12 = new Q12();

    /**
     *
     * @return arr which should hold the numbers stored from 1 to 100 inclusive
     * and passed to the next funciton to print
     */
    public int[] numbersStored1to100ToArray() {
        // allocates memory for 100 integer numbers
        arr = new int[100];
        int i;

        // save numbers from 1 to 100
        for (i = 1; i <= arr.length; i++) {
            arr[i - 1] = i;
        }
        return arr;
    }

    /**
     *
     * @param arr can be passed from numbersStored1to100ToArray
     * holds the stored integer numbers from 1 to 100 inclusive
     */
    public void printEvenNumbersFromArray(int[] arr) {
        for (int x : arr) {
            if (x % 2 == 0)
                System.out.println(x);
        }
    }

    public static void main(String[] args) {
        arr = q12.numbersStored1to100ToArray();
        q12.printEvenNumbersFromArray(arr);
    }
}

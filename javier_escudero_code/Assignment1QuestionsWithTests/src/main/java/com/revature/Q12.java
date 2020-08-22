package com.revature;

public class Q12 {

    public int[] numbersStored() {
        // allocates memory for 100 integer numbers
        int arr[] = new int[100];
        int i;

        // save numbers from 1 to 100
        for (i = 1; i <= arr.length; i++) {
            arr[i - 1] = i;
        }
        return arr;
    }

    public static void main(String[] args) {
        Q12 q12 = new Q12();
        int[] arr2 = q12.numbersStored();
        for (int x : arr2) {
            if (x % 2 == 0)
                System.out.println(x);
            }
        }
    }
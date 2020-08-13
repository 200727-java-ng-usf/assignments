/**
 * Q2. Write a program to display the first 25 Fibonacci numbers beginning at 0.
 */

package com.revature;

public class Q2 {

    public int[] first25FibonacciNumbers(int n) {
        // check for the edge cases
        if (n == 0) {
            return new int[0]; // the array size is zero
        }

        int fibArray[];    //declaring array
        fibArray = new int[n];  // allocating 25 int of memory to array;
        fibArray[0] = 0;
        fibArray[1] = 1;
        for (int i = 0, j = 1; i < n-2; i++, j++) {
            fibArray[j + 1] = fibArray[i] + fibArray[j]; // pattern starts at index [2]
            // i.e.  arr[2] =    arr[0]   +   arr[1];  and so on
        }
        return fibArray;
    }
//
//    public static void main(String[] args){
//        Q2 q2 = new Q2();
//        int arr [] = q2.first25FibonacciNumbers() ; // arr contains the Fibonacci numbers
//
//        int i = 0;
//        for(i = 0; i < 25; i++)
//            System.out.print( " " + arr[i] + " ");
//        System.out.println("\nThe first " + i + " Fibonacci numbers." );
//    }
}

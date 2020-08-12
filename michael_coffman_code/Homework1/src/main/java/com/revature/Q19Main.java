package com.revature;

import java.util.ArrayList;

public class Q19Main {


    public Q19Main() {
        super();
    }

    private void evenNumberSum() {

        int sum = 0; // should = 30 after method executes

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            array.add(i);
        }

        for (Integer integer : array) {
            if (integer % 2 == 0) { // is even
                sum += integer;
            }
        }
        System.out.println(array);
        System.out.println("The sum of all even numbers are: " + sum);
    }

    private void oddNumberSum() {
        int sum = 0; // should = 25 after method executes

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            array.add(i);
        }

        for (Integer integer : array) {
            if (integer % 2 != 0) { // is odd
                sum += integer;
            }
        }
        System.out.println(array);
        System.out.println("The sum of all odd numbers are: " + sum);
    }

    private void removePrimesAndPrint() {

        ArrayList<Integer> array = new ArrayList<>();

        // make array with 1-10 inside
        for (int i = 1; i <= 10; i++) {
            array.add(i);
        }

        System.out.println(array);
        System.out.println("Array after creation, before prime removal.");

        // outside loop to remove primes
        for (int i = 1; i <= 5;) {

            int factorCount = 0;

            for (int j = 2; j <= array.get(i); j++) {

                if (array.get(i) % j == 0) {
                    factorCount++;
                }
            }

            if (factorCount < 2) {
                array.remove(i);
            } else {
                i++;
            }
        }

        System.out.println(array);
        System.out.println("A size-10 array that has it's primes removed.");
    }

    public static void main(String[] args) {


        Q19Main answer = new Q19Main();
        answer.evenNumberSum(); // Creates and displays an arrayList with elements 1 - 10;
                                // Counts only the even numbers and returns the sum;

        System.out.println("+--------------------------------------------------+");

        answer.oddNumberSum(); // creates and displays an arrayList with elements 1 - 10;
                                // Counts only the odd numbers and returns the sum;

        System.out.println("+--------------------------------------------------+");

        answer.removePrimesAndPrint(); // Creates an arrayList with elements 1 - 10;
                                        // then removes the prime numbers based on factor count
                                        // prints out remaining array. No intermediate array.

        System.out.println("+--------------------------------------------------+");




    }

}

package com.revature;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Q13Main {

    public void printPyramid(int a, int b) {

        // instantiating a ArrayList numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // setting the first index value for loop logic
        numbers.add(0, a);

        // this loop is just for printing out the array after each value
        // is added to it's intended position
        for (int i = 0; i < 4; i++) {

            System.out.println(numbers);

            // nested if statements to determine if a or b should be added
            // to the first or last index of the array
            if (numbers.size() < 2) {
                numbers.add(0, b);
            } else if (numbers.size() == 2) {
                numbers.add(b);
            } else if (numbers.size() < 4) {
                numbers.add(0, a);
            }
        }
    }


    public static void main(String[] args) {

        Q13Main answer = new Q13Main();
        System.out.println("Results for 0 and 1");
        answer.printPyramid(0, 1);

        System.out.println("+------------------------------+");
        System.out.println("Results for any integer type.");
        answer.printPyramid(505, 1357); // change to whatever value of int type


    }

}

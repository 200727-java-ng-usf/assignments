package com.revature;

import java.util.Arrays;

public class QuestionTwelve {

    public static void main(String[] args) {

        int[] arr = new int[100]; //instantiated an int array with 100 open spaces

        Arrays.setAll(arr, i -> i + 1); // used lambda expression to place int 1 through 100 into the array
        System.out.println(Arrays.toString(arr)); //print out the arrays initial elements

            for (int i : arr) {
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i] + ", ");
                }
            }
    }

}

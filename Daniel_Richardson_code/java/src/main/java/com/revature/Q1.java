package com.revature;

import java.lang.reflect.Array;

public class Q1 {

    //made a bonus array displayer to keep main from looking gross and messy
    static public void arrayDisplay(int[] array, boolean original){
        if(original == true){
            System.out.print("Old:");
        } else {
            System.out.print("Current:");
        }
        for (int element: array) {
            System.out.print(" "+element);
            //using print instead of println since i don't want those NASTY new lines. SAD.
        }
    }

    static public void arrayDisplay(char[] array, boolean original){
        if(original == true){
            System.out.print("Old:");
        } else {
            System.out.print("Current:");
        }
        for (int element: array) {
            System.out.print(" "+element);
            //using print instead of println since i don't want those NASTY new lines. SAD.
        }
    }

    static public int[] bSort(int[] array) {
        int temp;
        //--------------------
        //Array[] newArray = new Array[array.length];
        //thought about putting comparison result in new array,
            // but it would end up being too messy
        // --------------------
        for (int i = 0; i < array.length; i++) {
            //basic loop to make a full run (in next loop) for each element

            for (int w = 1; w < array.length; w++) {
                // making comparisons for each element (and +1) all up the array
                if (array[w - 1] > array[w]) {
                    //comparison. > or < defines sort of array by end
                    temp = array[w - 1];
                    array[w - 1] = array[w];
                    array[w] = temp;
                }

            }
        }
        System.out.println(" ");
        return array;
    }

}
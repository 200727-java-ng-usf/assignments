package com.revature;

import static com.revature.AppDriver.defaults;

public class Q1 {
    //Perform a bubble sort on the following integer array:  1,0,5,6,3,2,3,7,9,8,4

    public Q1(){
        //makeArray(); //i like to auto-call this for the assignment, but it goofs up testing
    }

    public void makeArray(){
        int[] q1Array;
        if(!defaults){
            System.out.println("Requires int array.");
            InputHandler input = InputHandler.getInstance();
            q1Array = input.intArrayInput();
        } else {
            q1Array = new int[]{1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
        }
        arrayDisplay(q1Array, true);
        q1Array= bSort(q1Array);
        arrayDisplay(q1Array, false);
    }

    //made a bonus array displayer to keep main from looking gross and messy
     public static void arrayDisplay(int[] array, boolean original){
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
    /* //this was intended for Q3, didn't end up using it

    public void arrayDisplay(char[] array, boolean original){
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
    */
    public int[] bSort(int[] array) {
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
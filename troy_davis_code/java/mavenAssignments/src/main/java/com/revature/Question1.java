package com.revature;

public class Question1 {
    public static void main(String[] args) {
        int[] givenArray = {1,0,5,6,3,2,3,7,9,8,4};
        bubbleSort(givenArray);
        System.out.println("/n");
        System.out.println("All done, final array is: ");
        printValues(givenArray);
    }
    public static void printValues(int[] arr){
        for(int i : arr) {
            System.out.print(i + ", ");
        }
    }

    public static void bubbleSort(int[] arr2){
        int temp;
        boolean done = false;
        while (!done){
            done=true;
            for (int i =0; i < arr2.length-1; i++) {
                if(arr2[i] > arr2[i+1]){ //if the cuurent index is larger than the next:

                    //set temp value to the current value
                    temp = arr2[i];
                    //move the next digit to the current position, since its smaller
                    arr2[i] = arr2[i+1];
                    //bubble the current number up to the next slot
                    arr2[i+1] = temp;
                    System.out.println("The array values are");
                    printValues(arr2);
                    //since we had to do this, we are not done
                    done = false;
                }
            }
        }
    }
}

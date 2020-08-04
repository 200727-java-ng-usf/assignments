package com.revature;

public class BubbleSort {
    // method where the array is sorted
    static void bubbleSort(int[] arr){

        //number of arr elements stored
        int n = arr.length;
        int t= 0;

        for (int i = 0 ; i < n ; i ++){
            for (int j = 1; j < (n-i) ; j++ ){
                if( arr[j-1] > arr[j]){
                    t = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = t ;
                }

            }
        }
    }

    // main method where the sorted array is printed
    public static void main (String[] args){

        int[] arr = {1,0,5,6,3,2,3,7,9,8,4};

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arr.length; i++){  //loop to iterate through the array elements
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

}

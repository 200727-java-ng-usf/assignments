package com.revature;

public class q1bubbleSort {

    public static void main(String[] args){
        //this is the array
        int[] arr ={1,0,5,6,3,2,3,7,9,8,4};
        //this is the array before the bubble sort
        for(int i = 0;i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("+--------------+");
        //this here will bubble sort the numbers
        bubbleSort(arr);

        for(int i = 0; i< arr.length; i++ ){
            System.out.println(arr[i] + " ");
        }
        System.out.println("+--------------+");


    }
//this is the bubble sort question
    static void bubbleSort(int[] arr){
        //length of the array
        int n = arr.length;
        //these here are the accumulator
        int i,j;
        int temp;

        for(i = 0; i < n;i++){
            for(j = 1; j < n-1; j++){
                if(arr[j-1] >= arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}

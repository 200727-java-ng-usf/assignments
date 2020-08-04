package com.revature;

public class BubbleSort {
    public static void main(String[] args) {
        int temp;
        int[] arr = {1,0,5,6,3,2,3,7,9,8,4};

        int size = arr.length;
        //iterate through array
        for(int i = 0; i < size-1; i++) {

            for (int j = 0; j < i; j++) {

                //sort numbers
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);

        }



    }


}

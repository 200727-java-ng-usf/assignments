package com.revature.coreJavaAssign;

import java.util.Arrays;

public class q2Fibonacci {

//    static int f3, f2 = 0;
//    static int f1 = 1;
//    static int nextIdx = 0;
//
//    public static void push(int[] arr, int e){
//        arr[nextIdx] = e;
//        ++nextIdx;
//    }


    static int[] q2Fibonacci(int count) {
        //Check for edge cases
        if (count < 2) {
            int[] notWork = {0,1};
            return notWork;
        }
        //The array that will hold each fibonacciArray determined by the size of count
        int[] fibonacciArray = new int[count];

        // This is the first two numbers
            fibonacciArray[0] = 0;
            fibonacciArray[1] = 1;
            for (int i = 2; i < count; i++) {
                fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            }

          //  System.out.println(Arrays.toString(fibonacciArray));
//        //this for loop will include the starting numbers for the fibonacci numbers
//        for (int i = 0; i < 2; i++) {
//            fibonacciArray[i] = i;
//        }
//        System.out.print(fibonacciArray);

//        if (count > 0) {
//            //this is the fibonacci formula
//            f3 = f2 + f1;
////            System.out.print(" " + f3);
//            f1 = f2;
//            f2 = f3;
//            System.out.print(" " + f3);
//            //This is where f3 will be put into the array
//            push(fibonacciArray,f3);
//            //this is where a recurrsion method is used and will bring back up the count number untill it hits 0
//            q2Fibonacci(count- 1);
//        }
//        for(int i :fibonacciArray){
//            System.out.println(fibonacciArray[i]);
//        }
        return fibonacciArray;
        }

    }




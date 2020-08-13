package com.revature;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q2Test {

    private Q2 sut;

    @Before
    public void t1Setup(){
        sut = new Q2();
    }

    @Test
    public void testFibonacciNumbers() {
        int[] arrayExpected = { 0 ,1, 1,  2,  3,
                                5,  8,  13,  21,  34,
                                55,  89,  144,  233, 377,
                                610,  987,  1597,  2584,  4181,
                                6765,  10946,  17711,  28657,  46368 };
        int i = 0;
        for (; i < 25; i++)
            System.out.print(" " + arrayExpected[i] + " ");
        System.out.println("\nThe first " + i + " Fibonacci numbers.");
        assertArrayEquals(arrayExpected, sut.first25FibonacciNumbers(25));
    }

    @Test
    public void specificNumber() {
        int [] arr = new int[25];
        arr[24] = 46368;
        int[] actual = sut.first25FibonacciNumbers(25);
        assertEquals(arr[24], actual[24]);
        }
    }


//
//
//    public static void main(String[] args){
//        Q2 q2 = new Q2();
//        int arr [] = q2.first25FibonacciNumbers() ; // arr contains the Fibonacci numbers
//
//        int i = 0;
//        for(i = 0; i < 25; i++)
//            System.out.print( " " + arr[i] + " ");
//        System.out.println("\nThe first " + i + " Fibonacci numbers." );

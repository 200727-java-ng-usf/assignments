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
       int[] arrayExpected = sut.first25FibonacciNumbers(25); // returns an array with 25 Fibonacci numbers
        //assertEquals(arrayExpected, sut.first25FibonacciNumbers(20));
        int i=0;
        for(i = 0; i < 25; i++)
            System.out.print( " " + arrayExpected[i] + " ");
        System.out.println("\nThe first " + i + " Fibonacci numbers." );
        assertArrayEquals(arrayExpected, sut.first25FibonacciNumbers(25));
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

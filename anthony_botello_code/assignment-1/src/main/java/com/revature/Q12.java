package com.revature;

public class Q12{

    public static void main(String[] args){

        int[] ints = new int[100];
        for(int i = 0; i < 100; i++){

            ints[i] = i + 1;
        }

        for(int n : ints){

            if(n % 2 == 0) System.out.println(n);
        }
    }
}
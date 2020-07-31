package com.revature;

public class Q6{

    public static boolean isEven(int n){
        return (n & 1) == 0;
    }

    public static void main(String[] args){
        for(int i = 0; i < 20; i++){
            System.out.println(i + " is even: " + isEven(i));
        }
    }

}
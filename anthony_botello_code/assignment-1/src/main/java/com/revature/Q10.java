package com.revature;

public class Q10{

    public static int findMin(int a, int b){
        return (a < b) ? a : b;
    }

    public static void main(String[] args){

        System.out.println(findMin(5,3));
        System.out.println(findMin(2,7));
        System.out.println(findMin(1,1));
    }
}
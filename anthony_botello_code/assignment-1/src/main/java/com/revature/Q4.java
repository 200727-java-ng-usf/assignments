package com.revature;

public class Q4{

    public static long factorial(int n){
        if (n == 0) return 1;
        return (long) n * factorial(n - 1);
    }

    public static void main(String[] args){
        
        for(int i = 0; i < 20; i++){
            System.out.printf("%d! = %d\n", i, factorial(i));
        }
    }

}
package com.revature;

public class NFactorial {

    public static void main(String[] args) {
        int factor = 1;
        int number = 6;

        for(int i = 1; i <= number; i++){
            factor *= i;
        }
        System.out.println(factor);
    }
}

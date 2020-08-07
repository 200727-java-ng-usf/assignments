package com.revature;

public class Q4 {

    public static int factorial(int x){
        //factorial n!
        //ex 5! = 1x2x3x4x5 = 120
        int count = 1; //MUST start at 1, otherwise it'll just spam x*0 and spit out zeroes all day. SAD.

        for (int i = 1; i <= x; i++){ //init i at 1 to avoid multiplying by zero
            count *= i;
        }
        return count;
    }
}

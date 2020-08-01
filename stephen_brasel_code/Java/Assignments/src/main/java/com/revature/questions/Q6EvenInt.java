package com.revature.questions;

public class Q6EvenInt {
//    Q6. Write a program to determine if an integer is even without using the modulus operator (%)
    public boolean isEven(int x){
        /*
            Zero is an even number.
            In other words, its parity—the quality of an integer being even or odd—is even.
            This can be easily verified based on the definition of "even":
                it is an integer multiple of 2, specifically 0 × 2.
            ...
            In this sense, 0 is the "most even" number of all.
         */
        return ((x & (1)) == 0);
    }
}

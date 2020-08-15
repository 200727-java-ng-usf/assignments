package com.revature;

public class Q6 {
    /**
     * Q6. Write a program to determine if an integer
     * is even without using the modulus operator (%)
     */
    /**
     *
     * @param isEvenOrNot a whole number passed
     * @return true is number is even, false otherwise
     */
    static boolean isEven(int isEvenOrNot){

        double temporaryDouble = isEvenOrNot;
        boolean even = false;

        if(isEvenOrNot/2 == temporaryDouble/2)
        {
            even = true;
            System.out.println("The number is even!");
            return even;
        }
        else
        {
            System.out.println("The number is odd!");
            return even;
        }
    }
//    public static void main(String[] args) {
//        Q6.isEven(-1);
//        Q6.isEven(0);
//        Q6.isEven('a');
//        Q6.isEven(10);
//    }
}

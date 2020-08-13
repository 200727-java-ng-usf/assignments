package com.revature.question2;
/**
 * Q2. Write a program to display the first 25 Fibonacci numbers beginning at 0.
 */
public class Question2 {
    //noArgs constructor
    public Question2(){
        super();
    }
    //constructor to print the sequence upon instantiation
    public Question2(Integer upTo){
        printNumbers(upTo);
    }

    public void printNumbers(Integer upTo){
        //no need to compute if the requested number is null
        if (upTo == null) {
            System.out.println("");
            return;
        }
        //temporary integers to start off the fib sequence
        int currentFeb = 1;
        int previousFib = 0;
        int nextFib = 1;

        for (int i = 0; i <upTo ; i++){
            //go ahead and print the current fib number
            System.out.println(currentFeb);
            //next number equals the current number plus the previous number
            nextFib = previousFib + currentFeb;
            //move the previous fib to the current position
            previousFib = currentFeb;
            //move the current fib to the next position
            currentFeb = nextFib;
        }
    }
}

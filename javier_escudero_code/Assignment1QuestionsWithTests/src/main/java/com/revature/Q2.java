package com.revature;

/** Q2. Write a program to display the first 25 Fibonacci numbers beginning at 0.
 *
 */
public class Q2 {
    public void nFib(int n) {
        int num1 = 0;
        int num2 = 1;
        int nFibSum = 0;
        for (int i = 1; i != n + 1; i++) {
            //adds the new number to the old sum
            nFibSum = num1 + num2;
            num1 = num2;
            // saves the old sum
            num2 = nFibSum;
        }
        System.out.println(nFibSum);
    }

    public static void main(String[] args){
        Q2 testFibonacci = new Q2();
        testFibonacci.nFib(5);
    }
}

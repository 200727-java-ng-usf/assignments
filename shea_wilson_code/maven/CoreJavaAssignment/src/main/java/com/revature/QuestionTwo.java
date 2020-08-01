package com.revature;

public class QuestionTwo {

    public static void fib(int n ){

        int f1 = 0, f2 = 1, i;

        if (n < 1)
            return;

        for (i = 1; i <= n; i++)
        {
            System.out.print(f2+" ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }

    public static void main(String[] args){


        fib(25);
        

    }
}

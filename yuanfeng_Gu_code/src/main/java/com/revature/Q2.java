package com.revature;

public class Q2 {

    public Q2() {
    }

    public int fibonacci(int number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }




}

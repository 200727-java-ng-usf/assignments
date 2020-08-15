package com.revature;

public class Question6 {

    static boolean isEven(int n) {
        boolean isEven = true;

        for (int i = 1; i <= n; i++) {
            isEven = !isEven;

        }
        return isEven;
    }
}

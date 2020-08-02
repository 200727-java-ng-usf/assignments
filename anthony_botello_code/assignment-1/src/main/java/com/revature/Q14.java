package com.revature;

import java.time.LocalDate;
import java.util.Random;

public class Q14{

    public static Object switchDemo(int n){

        if(n > 3 || n < 1) return null;

        Object result = new Object();

        switch(n){

            case 1:
                int i = (new Random()).nextInt(1000);
                double sqrt = Math.sqrt(i);
                result = new double[] {i, sqrt};
                break;
            
            case 2:
                result = LocalDate.now();
                break;
            
            case 3:
                result = "I am learning Core Java".split("");
                break;
        }

        return result;
    }
}
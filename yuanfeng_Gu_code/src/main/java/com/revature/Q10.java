package com.revature;

public class Q10 {
    public int minNumber(int num1,int num2){
        if (num1==num2){
            return 0;
        }
        return (num1<num2)?num1:num2;
    }
}

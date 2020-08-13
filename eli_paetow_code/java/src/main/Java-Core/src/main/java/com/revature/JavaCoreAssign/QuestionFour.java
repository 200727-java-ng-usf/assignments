package com.revature.JavaCoreAssign;

public class QuestionFour {

    public static int factorialQ4(int num){

        if (num ==0)
            return 1;


        return num * factorialQ4(num -1);

    }

}

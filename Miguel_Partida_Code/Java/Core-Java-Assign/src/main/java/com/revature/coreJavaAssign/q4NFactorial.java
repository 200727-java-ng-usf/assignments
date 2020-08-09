package com.revature.coreJavaAssign;

public class q4NFactorial {

    static int q4NFactorial (int n) {
//        int fact, i ;
//
//        for (i = n, fact = 0;i > 0;
//        i--, fact++ ) {
//        }
        //if n equals to 0 or is negative it will return 0
        if(n == 0 || n <0){
            return 0;
        }
        //if it is another integer a recursion will happen
        //n *(n-1)*(n-2)... until 0 and then the equation will hit and return the value
        return n * q4NFactorial(n-1);
    }


}

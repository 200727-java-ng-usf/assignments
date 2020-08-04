package com.revature.coreJavaAssign;

public class q10Minimum {

    static void minNumber(int x,int y){
        //This ternary operator is say
        //if(x<y)its x if not pick y

        int minimumNumber =(x < y) ? x : y;

        System.out.println("The minimum number is " + minimumNumber);
    }
}

package com.revature.coreJavaAssign;

public class q10Minimum {

    static int minNumber(int x,int y){
        //This ternary operator is say
        //if(x<y)its x if not pick y
        //this is the edge case


        int minimumNumber =(x < y) ?  x : y;

        System.out.println("The minimum number is " + minimumNumber);
        return minimumNumber;
    }
}

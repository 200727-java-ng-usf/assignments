package com.revature.coreJavaAssign;

public abstract class q15Operators implements operators {
    @Override
    public int addition(int x, int y) {
        return x + y;
    }

    @Override
    public int subtraction(int x, int y) {
        return x - y ;
    }

    @Override
    public int multiplacation(int x, int y) {
        return x * y ;
    }

    @Override
    public int division(int x, int y) {
        int z =0;
        if (x==0||y==0){
            return z;
        }
        return x / y ;
    }
//    }
}

package com.revature.coreJavaAssign;

public abstract class q15Operators implements operators {



    @Override
    public int addition(int x, int y) {
        int z = x + y ;
        return z;

    }

    @Override
    public int subtraction(int x, int y) {
        int z = x - y;
        return z;
    }

    @Override
    public int multiplacation(int x, int y) {
        int z = x * y;
        return z;
    }

    @Override
    public int division(int x, int y) {
        int z = x / y;
        return z;
    }
}

package com.revature;

import java.security.CodeSource;

public class QuestionFifteen implements CalculateThings{

    static int a = 2;
    static int b = 6;

    @Override
    public int add(int x,int y){
        System.out.println(x  +  y );
        return x+y;

    }

    @Override
    public int subtract(int x, int y) {
        System.out.println(y - x);
        return y-x;

    }

    @Override
    public int multiply( int x ,int y) {

        System.out.println( x * y);
        return x*y;
    }

    @Override
    public int  divide(int x, int y) {
        System.out.println( y / x);
        return y/x;
    }

    public static void main(String[] args) {

        QuestionFifteen doh = new QuestionFifteen();

        doh.add(a,b);
        doh.subtract(a,b);
        doh.multiply(a,b);
        doh.divide(a,b);

    }
}

package com.revature.questions;

import com.revature.util.FloatPoints;

public class Q11PackageAccess {
//    Q11. Write a program that would access two float-variables from a class that exists in another package.
//    Note, you will need to create two packages to demonstrate the solution.

    private float a;
    private float b;

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public void printFloats(FloatPoints fp){
        a = fp.getX();
        b = fp.getY();
        System.out.println(
                "X: " + a + ", " +
                "Y: " + b);
    }
}

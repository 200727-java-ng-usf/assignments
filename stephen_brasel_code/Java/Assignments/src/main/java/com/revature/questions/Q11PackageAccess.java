package com.revature.questions;

import com.revature.util.FloatPoints;

public class Q11PackageAccess {
//    Q11. Write a program that would access two float-variables from a class that exists in another package.
//    Note, you will need to create two packages to demonstrate the solution.

    private FloatPoints fp;

    public float getA() {
        return fp.getX();
    }

    public float getB() {
        return fp.getY();
    }

    public void printFloats(FloatPoints fp){
        this.fp = fp;
        System.out.println(
                "X: " + getA() + ", " +
                "Y: " + getB());
    }
}

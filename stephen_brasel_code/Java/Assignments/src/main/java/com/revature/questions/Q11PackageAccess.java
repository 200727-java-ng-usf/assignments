package com.revature.questions;

import com.revature.testHelpers.FloatPoints;

public class Q11PackageAccess {
//    Q11. Write a program that would access two float-variables from a class that exists in another package.
//    Note, you will need to create two packages to demonstrate the solution.

    float a;
    float b;

    public static void printFloats(){
        a = FloatPoints.getX();
        b = FloatPoints.getY();
        System.out.println(
                "X: " + FloatPoints.getX() + ", " +
                "Y: " + FloatPoints.getY());
    }
}

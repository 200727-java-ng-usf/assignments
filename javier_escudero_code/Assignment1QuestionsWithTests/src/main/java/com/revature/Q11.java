package com.revature;

import resource.q11.*;

import java.util.ArrayList;

public class Q11 {
//Q11. Write a program that would access two float-variables
// from a class that exists in another package.
// Note, you will need to create two packages to demonstrate the solution.

    static public ArrayList<Float> accessingAnotherPackageClass(){

        ArrayList<Float> floats = new ArrayList<>();
        floats.add(0, accessQ11.a);
        floats.add(1, accessQ11.b);
        return floats;
    }

    public static void main(String[] args) {
        Q11.accessingAnotherPackageClass();
        System.out.println(Q11.accessingAnotherPackageClass());
    }
}

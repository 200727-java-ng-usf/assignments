/**
 * Q11.
 * Write a program that would access two float-variables from a class that exists in another package.
 * Note, you will need to create two packages to demonstrate the solution.
 */
package com.revature.question11.question11StoragePackage;

import java.util.Objects;


public class Question11FloatStorage {
    //static floats to store the values of the floats in the object
    private static float float1;
    private static float float2;

    //no args constructor
    public Question11FloatStorage() {
        super();
    }

    public float getFloat1() {
        return float1;
    }

    public void setFloat1() {
        //generate pseudo-random floats to be accessed
        double temp1 = Math.random()*100;
        float1 = (float) temp1;

    }

    public float getFloat2() {
        return float2;
    }

    public void setFloat2() {
        //generate pseudo-random floats to be accessed
        double temp2 = Math.random()*100;
        float2 = (float) temp2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question11FloatStorage)) return false;
        Question11FloatStorage that = (Question11FloatStorage) o;
        return Float.compare(that.getFloat1(), getFloat1()) == 0 &&
                Float.compare(that.getFloat2(), getFloat2()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFloat1(), getFloat2());
    }

    @Override
    public String toString() {
        return "question11FloatStorage{" +
                "float1=" + float1 +
                ", float2=" + float2 +
                '}';
    }
}

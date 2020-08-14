/**
 * Q11.
 * Write a program that would access two float-variables from a class that exists in another package.
 * Note, you will need to create two packages to demonstrate the solution.
 */
package com.revature.question11.question11AccessorPackage;

import com.revature.question11.question11StoragePackage.Question11FloatStorage;

import java.util.Objects;

public class Question11FloatAccessor {
    //float fields to hold the values accessed from the storage class in another package
    private float accessedFloat1;
    private float accessedFloat2;

    public Question11FloatAccessor() {
        //create a new instance of the class from the storage package
        Question11FloatStorage floatStorage = new Question11FloatStorage();
        //generate new floats to be accessed
        floatStorage.setFloat1();
        floatStorage.setFloat2();
        //access the floats and assign them to here
        this.accessedFloat1 = floatStorage.getFloat1();
        this.accessedFloat2 = floatStorage.getFloat2();
        //print the values of the floats, demonstrating that this class is
        // accessing the floats from a class that exist in another package
        System.out.println("Accessed float 1 is: " + accessedFloat1);
        System.out.println("Accessed float 2 is: " + accessedFloat2);
    }

    public float getAccessedFloat1() {
        return accessedFloat1;
    }

    public void setAccessedFloat1(float accessedFloat1) {
        this.accessedFloat1 = accessedFloat1;
    }

    public float getAccessedFloat2() {
        return accessedFloat2;
    }

    public void setAccessedFloat2(float accessedFloat2) {
        this.accessedFloat2 = accessedFloat2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question11FloatAccessor)) return false;
        Question11FloatAccessor that = (Question11FloatAccessor) o;
        return Float.compare(that.getAccessedFloat1(), getAccessedFloat1()) == 0 &&
                Float.compare(that.getAccessedFloat2(), getAccessedFloat2()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccessedFloat1(), getAccessedFloat2());
    }

    @Override
    public String toString() {
        return "Question11FloatAccessor{" +
                "accessedFloat1=" + accessedFloat1 +
                ", accessedFloat2=" + accessedFloat2 +
                '}';
    }
}

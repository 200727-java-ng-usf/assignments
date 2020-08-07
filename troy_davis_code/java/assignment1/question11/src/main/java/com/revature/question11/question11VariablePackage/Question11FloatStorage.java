package com.revature.question11.question11VariablePackage;

import java.util.Objects;
import java.util.Random;

public class Question11FloatStorage {
    //floats to store the values of the floats in the object
    private float float1;
    private float float2;

    public Question11FloatStorage() {
        //generate pseudo-random floats(mutated by instance Hashcode) to be accessed upon instantiation
        this.float1 = ((float) Math.random())*this.hashCode();
        this.float2 = ((float) Math.random())*this.hashCode();
    }

    public float getFloat1() {
        return float1;
    }

    public void setFloat1(float float1) {
        this.float1 = float1;
    }

    public float getFloat2() {
        return float2;
    }

    public void setFloat2(float float2) {
        this.float2 = float2;
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

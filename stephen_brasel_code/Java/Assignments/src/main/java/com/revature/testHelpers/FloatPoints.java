package com.revature.testHelpers;

public class FloatPoints {
    float x = 42.0F;
    float y = 31.0F;

    public FloatPoints() {
        super();
    }

    public FloatPoints(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public static float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public static float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}

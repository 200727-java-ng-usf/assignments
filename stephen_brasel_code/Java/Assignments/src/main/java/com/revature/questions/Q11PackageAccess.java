package com.revature.questions;

import com.revature.util.FloatPoints;

/**
 * A <code>Q11PackageAccess</code> access 2 floats from a different package.
 * @author stephen.brasel@gmail.com
 */
public class Q11PackageAccess {
//    Q11. Write a program that would access two float-variables from a class that exists in another package.
//    Note, you will need to create two packages to demonstrate the solution.

    /**
     * A reference to a <code>{@link FloatPoints}</code> instance.
     */
    private FloatPoints fp;

    /**
     *  Returns the value of x stored in
     *  the internal variable reference of an instance of <code>{@link FloatPoints}</code>, fp.getX()
     * @return the internal <code>{@link FloatPoints}</code> variable fp.getX()
     */
    public float getA() {
        return fp.getX();
    }

    /**
     *  Returns the value of y stored in
     *  the internal variable reference of an instance of <code>{@link FloatPoints}</code>, fp.getY()
     * @return the internal <code>{@link FloatPoints}</code> variable fp.getY()
     */
    public float getB() {
        return fp.getY();
    }

    /**
     * Prints both x and y values of an instance of the <code>{@link FloatPoints}</code> class
     * @param fp an instance of <code>{@link FloatPoints}</code> that will be printed from.
     */
    public void printFloats(FloatPoints fp){
        this.fp = fp;
        System.out.println(
                "X: " + getA() + ", " +
                "Y: " + getB());
    }
}

package com.revature.questions;
import com.revature.externalpackage.*;

public class Question11A extends Question11B {
    public float[] aquireFarFloats() {
        //Aquire floats in another package because they are public, and this class extends the other class.
        float f[] = new float[2];
        f[0] = fl1;
        f[1] = fl2;
        System.out.println(f[0]);
        System.out.println(f[1]);
        //return the array of the floats.
        return f;
    }



}

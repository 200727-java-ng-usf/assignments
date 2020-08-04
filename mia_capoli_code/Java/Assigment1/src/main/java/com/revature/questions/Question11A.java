package com.revature.questions;
import com.revature.externalpackage.*;

public class Question11A {
    public void aquireFarFloats() {
        Question11B floatGetter = new Question11B();
        float f[] = new float[2];
        f[0] = floatGetter.fl1;
        f[1] = floatGetter.fl2;
        System.out.println(f[0]);
        System.out.println(f[1]);
    }



}

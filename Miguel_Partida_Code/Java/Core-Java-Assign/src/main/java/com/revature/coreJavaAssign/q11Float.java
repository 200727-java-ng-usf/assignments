package com.revature.coreJavaAssign;
//This import will connect to the q11Driver class
import com.revature.anotherOne.q11Driver;

import static java.lang.Float.valueOf;


public class q11Float {
   static float[] floatsFromThere() {
      //created the object floats to carry the refrences to this method
      q11Driver floats = new q11Driver();

      //assigning both floats form anotherOne to floats in this method
      float floatOne = valueOf(floats.float1);
      float floatTwo = valueOf(floats.float2);

      System.out.println("This is the first float: " + floatOne + " This is the second float: " + floatTwo);
      float[] floatArray = {floatOne,floatTwo};
      return floatArray;
   }
}
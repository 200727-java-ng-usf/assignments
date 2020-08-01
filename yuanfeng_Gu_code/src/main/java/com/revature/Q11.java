package com.revature;

import com.revature.Q11A.FloatA;
import com.revature.Q11B.FloatB;

public class Q11 {
     public void printFloat(){
         FloatA a = new FloatA();
         FloatB b = new FloatB();

         System.out.println("The float from Package Q11A :"+ a.getSecondFloat());
         System.out.println("The float from Package Q11B :"+b.getFirstFloat());

     }
}

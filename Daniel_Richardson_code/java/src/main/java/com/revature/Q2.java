package com.revature;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//import java.lang.Math;


public class Q2{



    public static int[] fSeq(int targetNum){
        //fibo sequence is n3 = n2 + n1
        int num1 = 0;
        int num2 = 1;
        int num3;
        int[] fArr = new int[targetNum];
        fArr[0]=num1;
        fArr[1]=num2;


        //originally just printing results
        //System.out.print(num1 + " ");
        //System.out.print(num2 + " ");

        for(int i = 2; i < targetNum; i++){ //init i to 2, since we already had 2 elements
            num3 = num1 + num2; // 0,1,(1)
            //System.out.print(num3 + " "); //rewrote this to remove souts
            num1 = num2; // 0*,(1),1
            num2 = num3; // 0,1*,(1)
            fArr[i] = num3;
        }
        return fArr;


    }

    /* I forgot fsequence and pi are totally not the same thing
    public static void tessst(){
        double test = Math.PI;
        System.out.println(test);
    }
     */

}

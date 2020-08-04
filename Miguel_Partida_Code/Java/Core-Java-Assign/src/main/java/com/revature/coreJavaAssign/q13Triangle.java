package com.revature.coreJavaAssign;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class q13Triangle {

    static void makeTriangle() {
        //the number of rows that will be made
        int rows = 8;

        for (int p = 1; p <= rows; p++) {
            for (int j = 1; j <= p; j++) {
                //int k = j + p;
                if((p+j) % 2 == 1){
                    System.out.print("1");
                }else
                    System.out.print("0");

            }
        }
        System.out.println();
    }
}

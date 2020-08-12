package com.revature.questions;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*

    Q13. Display the triangle on the console as follows using any type of loop.
    Do NOT use a simple group of print statements to accomplish this.
        0
        1 0
        1 0 1
        0 1 0 1

 */
public class Q13 {

    public static void main(String[] args) {

        int val = 0;
        int onLine = 1;

        for (int i = 0 ; i < 4 ; i++) {
            for(int j = 0; j < onLine ; j++){

                if (val==0) {
                    System.out.print(val + " ");
                    val = 1;
                }
                else {
                    System.out.print(val + " ");
                    val = 0;
                }
            }

            onLine++;
            System.out.println();
        }
    }
}

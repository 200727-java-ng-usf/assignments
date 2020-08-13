package com.revature.coreJavaAssign;

import static com.revature.coreJavaAssign.q6EvenNumber.isItEven;

public class q12StoreArray {

    static int[] even100(int[] evenArray) {
        int i;


        //now to populate it with the actual values
        for (i = 0; i < evenArray.length; i++) {
            evenArray[i] = i + 1;
        }

        //this will iterate through the array
        int[] evens = new int[50];
        for (int j : evenArray) {
            if (j % 2 == 0) {
                //this will print every
                System.out.print(j + " ");
                evens = new int[j];
            }
        }

        return evens;

    }

    }


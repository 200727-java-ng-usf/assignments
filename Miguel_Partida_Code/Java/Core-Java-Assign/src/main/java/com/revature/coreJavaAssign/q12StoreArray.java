package com.revature.coreJavaAssign;

import java.util.ArrayList;

import static com.revature.coreJavaAssign.q6EvenNumber.isItEven;

public class q12StoreArray {

    static ArrayList<Integer> even100(int[] evenArray) {
        int i;
        ArrayList<Integer> evenHolder = new ArrayList<>();

        //now to populate it with the actual values
        for (i = 0; i < evenArray.length; i++) {
            evenArray[i] = i + 1;
        }

        //this will iterate through the array
        for (int j : evenArray) {
            if (j % 2 == 0) {
                //this will print every
                System.out.print(j + " ");
                evenHolder.add(j);

            }
        }

        return evenHolder;

    }

    }


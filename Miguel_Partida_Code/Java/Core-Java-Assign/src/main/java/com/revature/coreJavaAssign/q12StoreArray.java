package com.revature.coreJavaAssign;

import static com.revature.coreJavaAssign.q6EvenNumber.isItEven;

public class q12StoreArray {

    static void even100(){
        int i;
        //this is my array with the size of 100
        int[] evenArray = new int[100];

        //now to populate it with the actual values
        for(i = 0;i < evenArray.length;i++){
            evenArray[i] = i + 1;
        }
        
        //this will iterate through the array
        for (int j : evenArray ) {
           if (j % 2 == 0) {
                //this will print every
                System.out.print(j + " ");
            }
        }


        }

    }


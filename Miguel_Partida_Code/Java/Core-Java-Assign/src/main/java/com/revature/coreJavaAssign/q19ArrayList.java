package com.revature.coreJavaAssign;

import java.util.ArrayList;

public class q19ArrayList {
    private static q9Prime q19prime;

    public static ArrayList<Integer> q19ArrayList(ArrayList<Integer> primaryList){
        int evenSum = 0;
        int oddSum = 0;

        for(int i =0; i < primaryList.size();i++){
            int currentNumber = primaryList.get(i);
            if(currentNumber % 2 ==0 ){
                 evenSum =+ currentNumber;
            }
        }
        System.out.println("This is the even Number sum " + evenSum);

        for(int j =0;j < primaryList.size();j++){
            int currentNumber = primaryList.get(j);
            if(currentNumber % 2 != 0){
                oddSum =+ currentNumber;
            }
        }
        System.out.println("This is the odd number sum " + oddSum);

        for(int h = 0; h < primaryList.size() ; h++){
            int currentNumber = primaryList.get(h);
            if(q19prime.checkIfPrime(currentNumber)==false||currentNumber ==1){
                primaryList.remove(h);
            }
        }

return primaryList;

    }
}


package com.revature;


import java.util.ArrayList;

public class Q12 {
    public ArrayList<Integer> printEven(int[] num){
        ArrayList<Integer> returnArr = new ArrayList<>();
        for (int i=0;i< num.length;i++){
                if(num[i]%2==0 && num[i]!=0){
                    returnArr.add(num[i]);

                }

        }
        return returnArr;
    }
}

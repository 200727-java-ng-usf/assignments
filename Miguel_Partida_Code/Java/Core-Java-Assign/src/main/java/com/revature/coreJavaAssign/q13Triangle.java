package com.revature.coreJavaAssign;


public class q13Triangle {


    static void makeTriangle() {
        //the number of rows that will be made
        int rows = 8;
        //this is the number of rows it will iterate
        for (int r = 1; r <= rows; r++) {
            //this is the number of columns it will iterate
            for (int c = 1; c<=r; c++) {
                //int k = j + p;
                if((r+c) % 2 == 1){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            //this will make the line skip down after the second for loop is finished iterating
            System.out.println(" ");

        }
    }
}

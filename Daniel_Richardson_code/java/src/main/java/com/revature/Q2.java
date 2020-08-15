package com.revature;


import static com.revature.AppDriver.defaults;

public class Q2{
//Write a program to display the first 25 Fibonacci numbers beginning at 0.

    public Q2(){
        int count;
        if(!defaults){
            System.out.println("Requires amount of Fibonacci numbers.");
            InputHandler input = InputHandler.getInstance();
            count = input.intInput();
        }else{
            count = 25;
        }
        System.out.println("Count: "+count+" : ");
        int[] fArray = fSeq(count);
        Q1.arrayDisplay(fArray, false);
    }

    public int[] fSeq(int targetNum){
        //fibo sequence is n3 = n2 + n1
        int num1 = 0;
        int num2 = 1;
        int num3;
        int[] fArr = new int[targetNum];
        fArr[0]=num1;
        fArr[1]=num2;

        for(int i = 2; i < targetNum; i++){ //init i to 2, since we already had 2 elements
            num3 = num1 + num2; // 0,1,(1)
            num1 = num2; // 0*,(1),1
            num2 = num3; // 0,1*,(1)
            fArr[i] = num3;
        }
        return fArr;
    }
}

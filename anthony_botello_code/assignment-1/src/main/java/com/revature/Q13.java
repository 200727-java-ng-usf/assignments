package com.revature;

public class Q13{

    public static void main(String[] args){

        int n = 0;
        for(int i = 0; i < 4; i++){

            n += i;

            int k = n;
            for(int j = 0; j < i + 1; j++){
                
                System.out.print(k % 2);
                k++;
            }

            System.out.println();
        }
    }
}
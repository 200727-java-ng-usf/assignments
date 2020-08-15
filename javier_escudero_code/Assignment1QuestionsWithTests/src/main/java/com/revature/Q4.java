package com.revature;

public class Q4 {

    public int calculateFactorial(int n ) {
        int arr[] = new int[20];
        //arr = new int[n];
        arr[0] = 1;
        for(int i = 1; i <= n; i++) {
            arr[i] = (i * arr[i-1]);
        }
        return arr[n];
    }

//        public static void main(String args[]) {
//            Q4 q = new Q4();
//            int i = q.calculateFactorial(8);
//            System.out.println(i);
//        }
}


package com.revature;

import java.util.ArrayList;

public class Question19 {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(6);
        numList.add(7);
        numList.add(8);
        numList.add(9);
        numList.add(10);

        for (int i = 0; i <= numList.size() - 1; i++) {
            System.out.print(numList.get(i) + " ");
        }
        System.out.println();
        System.out.println("---------------------");
        int even = 0;
        for (int i = 0; i <= numList.size(); i++) {
            if(i % 2 == 0) {
                even = even + i;

            }
        }
        System.out.println(even);

        System.out.println("---------------------");
        int odd = 0;
        for (int i = 0; i <= numList.size(); i++) {
            if(i % 2 != 0) {
                odd = odd + i;
            }
        }
        System.out.println(odd);

        System.out.println("---------------------");
        int noPrime = 0;
        for (int i = 2; i <= numList.size()/2; i++) {
            if(i % i == 0) {
               noPrime = numList.remove(i);
               System.out.println(noPrime);
            }
        }

    }
}

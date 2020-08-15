package com.revature;

import java.util.ArrayList;

public class Q9 {
    /**
     * Q9. Create an ArrayList which stores numbers from 1 to
     * 100 and prints out all the prime numbers to the console.
     */
    static ArrayList<Integer> arrayList = new ArrayList<>(100);
    static ArrayList<Integer> primeList = new ArrayList<>(100);
    static public void storeNumbers1to100(){

        // stores numbers 1 to 100
        for(int i = 0; i < 100; i++){
            arrayList.add(i);
        }
        //prime number is > 1 and only divisible by 1 and itself
        System.out.println(arrayList);
    }

    static public void deleteSomeFrom1to100(){

        // stores numbers 1 to 100
        for(int i = 0; i < 100; i++){
            if(i == 2)
            arrayList.remove(i);
        }
        //prime number is > 1 and only divisible by 1 and itself
        System.out.println(arrayList);
    }

    static public ArrayList<Integer> deleteIfNotPrime1to100(){

        // copy arraylist to primeList
        for(int i = 0; i < arrayList.size(); i++) {
            primeList.add(arrayList.get(i));
        }
        System.out.println("\nPrime list " + primeList);
        //prime number is > 1 and only divisible by 1 and itself
        System.out.println(arrayList);
        return primeList;
    }
    public static void main(String[] args) {
        Q9.storeNumbers1to100();
        Q9.deleteSomeFrom1to100();
        Q9.deleteIfNotPrime1to100();
    //    System.out.println(arrayList);
    }
}
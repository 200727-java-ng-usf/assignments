package com.revature;

import java.util.ArrayList;

public class Q9 {
    /**
     * Q9. Create an ArrayList which stores numbers from 1 to
     * 100 and prints out all the prime numbers to the console.
     */
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static ArrayList<Integer> primeList = new ArrayList<>();
    static public void storeNumbers1to100(){

        // stores numbers 1 to 100
        for(int i = 0; i < 100; i++){
            arrayList.add(i+1);
        }
        //prime number is > 1 and only divisible by 1 and itself
        System.out.println("\narrayList " +arrayList);
    }

    static public void /*ArrayList<Integer> */ onlyPrime1to100(){

        // copy arraylist to primeList
        for(int i = 0; i < 100; i++) {
            primeList.add(arrayList.get(i));
        }

        // delete composite numbers (not prime) from the list
        primeList.remove(0); // deleting 1

//        primeList.remove(98);
        int i = 0;
        int divisor = 1;
        int factorCount = 0;
        System.out.println(arrayList.size());
        while (primeList.get(i) < (arrayList.size() )) {// 100 !=  100 while last number is not the last
            while( ( ( primeList.get(i) % divisor ) == 0 ) && ( divisor <= primeList.get(i) ) ) {
                ++factorCount;//2:1 2  3:1 2      4: 1 2  5: 1 2   6:1 2 3
                ++divisor;    //2:2 3  3:2 4      4: 2 5  5: 2 61  6:2 3 4
                if( factorCount >= 3 || divisor > (primeList.get(i) +1 ) ){ // 6 count ==3
                    primeList.remove(i); // 4 removed, 5, 6
                    divisor = 1;
                    factorCount = 0;
                }
            }
            if ( (primeList.get(i) % divisor != 0)) {
                ++divisor;
            }
            if( divisor > primeList.get(i)){
                ++i;// 1
                divisor = 1;
                factorCount = 0;
            }
        }
        primeList.remove((primeList.size()-1)); // removes the last index, i.e. 100
}

    public static void main(String[] args) {
        Q9.storeNumbers1to100();
        Q9.onlyPrime1to100();
        System.out.println("Prime" + Q9.primeList);
    }
}
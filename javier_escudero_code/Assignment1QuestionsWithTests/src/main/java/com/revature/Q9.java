package com.revature;

import java.util.ArrayList;

public class Q9 {
    /**
     * Q9. Create an ArrayList which stores numbers from 1 to
     * 100 and prints out all the prime numbers to the console.
     */
     ArrayList<Integer> arrayList = new ArrayList<>();
     ArrayList<Integer> primeList = new ArrayList<>();

    public void storeNumbers1to100(){

        // stores numbers 1 to 100
        for(int i = 0; i < 100; i++){
            arrayList.add(i+1);
        }
    }

    static public ArrayList<Integer> onlyPrime1to100(){

        Q9 q9 = new Q9();
        q9.storeNumbers1to100();

        // copy arraylist to primeList
        for(int i = 1; i < 100; i++) {
            q9.primeList.add(q9.arrayList.get(i));
        }

        // delete composite numbers (not prime) from the list
     //   primeList.contains(primeList.indexOf()); // deleting 1

   //     primeList.remove(0);

//        primeList.remove(98);
        int i = 0;
        int divisor = 1;
        int factorCount = 0;
       // System.out.println(arrayList.size());
        while (q9.primeList.get(i) < (q9.arrayList.size() )) {// 100 !=  100 while last number is not the last
            while( ( ( q9.primeList.get(i) % divisor ) == 0 ) && ( divisor <= q9.primeList.get(i) ) ) {
                ++factorCount;//2:1 2  3:1 2      4: 1 2  5: 1 2   6:1 2 3
                ++divisor;    //2:2 3  3:2 4      4: 2 5  5: 2 61  6:2 3 4
                if( factorCount >= 3 || divisor > (q9.primeList.get(i) +1 ) ){ // 6 count ==3
                    q9.primeList.remove(i); // 4 removed, 5, 6
                    divisor = 1;
                    factorCount = 0;
                }
            }
            if ( (q9.primeList.get(i) % divisor != 0)) {
                ++divisor;
            }
            if( divisor > q9.primeList.get(i)){
                ++i;// 1
                divisor = 1;
                factorCount = 0;
            }
        }
        q9.primeList.remove((q9.primeList.size()-1)); // removes the last index, i.e. 100
        return q9.primeList;
    }

//    public static void main(String[] args) {
//        Q9.onlyPrime1to100();
//        System.out.println("Prime" + Q9.primeList);
//    }
}
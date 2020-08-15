package com.revature.JavaCoreAssign;

import java.util.ArrayList;

//Create an ArrayList which stores numbers from 1 to 100 and prints out all the prime numbers to the console.
public class QuestionNine {

    public static ArrayList<Integer> prime_100_Q9() {
        ArrayList<Integer> listTo100 = new ArrayList<Integer>();

        for (int i = 0; i < 101; i++) {
            listTo100.add(i);
        }

        ArrayList<Integer> primesOnly = new ArrayList<Integer>();
        ArrayList<Integer> trashNums = new ArrayList<Integer>();


        for (int primeNum : listTo100) {

            boolean primeTrue = primeCheck(primeNum);

            if (primeTrue) {
                primesOnly.add(primeNum);
            }else{
                trashNums.add(primeNum);
            }
        }
        System.out.println("prime numbers 0 to 100");
        System.out.println(primesOnly);


        return primesOnly;
    }

    public static boolean primeCheck(int num) {

        if (num == 1 || num == 0) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;

            }


        }return true;
    }

//    public static void main(String[] args) {
//        prime_100_Q9();
//    }
}








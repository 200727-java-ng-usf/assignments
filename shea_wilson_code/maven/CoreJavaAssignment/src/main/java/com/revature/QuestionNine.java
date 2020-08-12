package com.revature;
import java.util.ArrayList;
import java.util.List;

/*
    Prime number cannot be divided by any other number other itself or one.
 */

public class QuestionNine {

    static public List<Integer> checkIfPrime(List<Integer> num) {
        List<Integer> prime = new ArrayList<>();

        for (int j = 1 ; j < num.size() ; j++) {
            for (int x = 2; x < (int) Math.sqrt(num.indexOf(j)); x++) {
                for (int i = 1; i < num.size(); i++) {
                    if (num.indexOf(i) % x == 0)
                        prime.add(i);
                }
            }
        }
        System.out.println(prime);
        return null;
    }



    public static void main(String[] args) {
        int num = 1 ;
        List<Integer> numbers = new ArrayList<>(); //create an empty ArrayList
        for (int i = 1 ; i <= 100; i++){
            numbers.add(num++); //Add all int between 1 and 100 to the ArrayList
        }

        System.out.println(numbers); // Print the ArrayList to the console.

        System.out.println("----------------------------------------------------------");

        System.out.println(checkIfPrime(numbers));
        //find all the prime ints in the ArrayList






        



    }
}

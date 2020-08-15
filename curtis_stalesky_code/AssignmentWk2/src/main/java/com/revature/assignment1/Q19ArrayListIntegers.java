package com.revature.assignment1;

import java.util.ArrayList;

public class Q19ArrayListIntegers {
    public static void main(String[] args) {

        // Need to Create an ArrayList and then Add 1-10 into the lest
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // next step is to display the ArrayList
        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.print(" " +numbers.get(i)); // displays all the numbers in the array list
        }
        System.out.println(" ");
        System.out.println("+--------------Break------------------+");

        // Then add all the even numbers up and display the result
        // better to use a while loop?
        int total = 0;
        int num = 0;
        boolean prime;

        // for loop to iterate through the array
        for (int i = 0; i < numbers.size(); i++)
        {
            // Upon some research, a for loop is used to get the item in the array and divide it by 2 until the
            // remainder is equal to 0 using % or modulus(mod for short) if it = 0 then the number is not prime
            // another way was to use a while loop in the same fashion. I'll need to set up a for loop to start
            // dividing numbers in the arrayList by 2 and the ones that do equal 0 will be added to sum that gets
            // tallied by the total.

            // For loop that starts to divide an element in the arrayList by 2 to equal 0
            for (int a = 2; a <= numbers.get(i)/2; a++ ){
                // Used an if to compare the current array element is equal to current counter starting at 0
                if (numbers.get(i) == 0) {
                    num = numbers.get(i);
                } //else  { prime = true; }

            }
            // num = numbers.get(i);
            total += num;


        }


        System.out.println(total); // Should equal 30

        // Then remove the prime numbers from the ArrayList and print out
        // the remaining ArrayList

    }



}


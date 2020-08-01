package com.revature;

import java.sql.SQLOutput;
import java.util.ArrayList;

/*
    Q19. Create an ArrayList and insert integers 1 through 10. Display the ArrayList.
    Add all the even numbers up and display the result. Add all the odd numbers up and display the result.
    Remove the prime numbers from the ArrayList and print out the remaining ArrayList.
 */
public class Q19 {

    public static void main(String[] args) {

        //Create an ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>(10);

        //insert integers 1 through 10
        for(int i = 0; i < 10; i++){
            arr.add(i, i+1);
        }
        //Display the ArrayList
        System.out.println("ArrayList " + arr.toString());

        //Add all the even numbers
        int evenNumbersSum = 0;
        for(int i = 0; i < 10; i++){
            if(arr.get(i)%2==0)
                evenNumbersSum += arr.get(i);
        }
        //display the result
        System.out.println("Sum of even numbers " + evenNumbersSum);

        //Add all the odd numbers
        int oddNumbersSum = 0;
        for(int i = 0; i < 10; i++){
            if(arr.get(i)%2!=0)
                oddNumbersSum += arr.get(i);
        }
        //display the result
        System.out.println("Sum of odd numbers " + oddNumbersSum);





    }

    // call isPrime from Q9


}

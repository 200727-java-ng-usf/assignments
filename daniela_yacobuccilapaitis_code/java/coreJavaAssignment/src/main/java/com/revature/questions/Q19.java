package com.revature.questions;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

/*
    Q19. Create an ArrayList and insert integers 1 through 10. Display the ArrayList.
    Add all the even numbers up and display the result. Add all the odd numbers up and display the result.
    Remove the prime numbers from the ArrayList and print out the remaining ArrayList.
 */
public class Q19 {

    public static void main(String[] args) {

        //Create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>(10);
        Iterator<Integer> iterator = arrayList.iterator();

        //insert integers 1 through 10
        for(int i = 0; i < 10; i++){
            arrayList.add(i, i+1);
        }
        //Display the ArrayList
        System.out.println("ArrayList " + arrayList.toString());

        //Add all the even numbers
        int evenNumbersSum = 0;
        for(int i = 0; i < 10; i++){
            if(arrayList.get(i)%2==0)
                evenNumbersSum += arrayList.get(i);
        }
        //display the result
        System.out.println("Sum of even numbers " + evenNumbersSum);

        //Add all the odd numbers
        int oddNumbersSum = 0;
        for(int i = 0; i < 10; i++){
            if(arrayList.get(i)%2!=0)
                oddNumbersSum += arrayList.get(i);
        }
        //display the result
        System.out.println("Sum of odd numbers " + oddNumbersSum);

        while(iterator.hasNext()) {
            Integer temp = iterator.next();
            if(Q9.isPrime(temp)) {
                arrayList.remove(temp);
            }
        }

        System.out.println(arrayList.toString());
    }

    // TODO isPrime Q9


}

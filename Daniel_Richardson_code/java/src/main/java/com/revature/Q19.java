package com.revature;
import java.util.ArrayList;

public class Q19 {
    //Create an ArrayList and insert integers 1 through 10.
    // Display the ArrayList. Add all the even numbers up and display the result.
    // Add all the odd numbers up and display the result.
    // Remove the prime numbers from the ArrayList and print out the remaining ArrayList.


    //note:I did Q19 before Q9, which had a better prime number method
    //ill change this if i get the time

    public void aList(){
        ArrayList<Integer> ints = new ArrayList<Integer>(); //make arraylist

        for(int i = 1; i < 11 ; i++){ //adding stuff
            ints.add(i);

        }
        for(int i = 0; i < ints.size() ; i++){
            System.out.print(ints.get(i)); //displaying arrayList stuff
        }
        System.out.println();
        int counterEven = 0;
        int counterOdd = 0;
        for(int i = 0; i < ints.size() ; i++) { //adding stuff
            //getting even numbers

            if (ints.get(i) % 2 == 0) {
                counterEven += ints.get(i);
            } else if(ints.get(i)%2 != 0){ //then odd
                counterOdd += ints.get(i);
            }
        }
        System.out.println();
        System.out.println("Even sum: "+counterEven);
        System.out.println("Odd sum: "+counterOdd);

        for(int i = 0; i < ints.size() ; i++){
            for(int w = 2; w <= ints.size()/2; w++){ //init at 2. using one would include it as a prime
                //primes can't be divided by anything but 1 and itself
                if(ints.get(i)%w != 0){
                    System.out.println("removed"+ints.get(i));
                    ints.remove(ints.get(i));
                }
            }
        }

        System.out.print("ArrayList no primes: ");
        for(int i = 0; i <ints.size(); i++){
            System.out.print(ints.get(i));
        }
        System.out.println();
    }

}

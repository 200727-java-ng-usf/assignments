package com.revature;

import java.util.ArrayList;

public class Q9 {
    //Create an ArrayList which stores numbers
    // from 1 to 100 and prints out all the prime numbers to the console.

    public Q9(){
        primeList();
    }

    public void primeList(){
        ArrayList<Integer> nums = new ArrayList<>(); //make arraylist
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i = 1; i < 101 ; i++){ //adding stuff
            nums.add(i);
        }

        //the Sieve of Eratosthenes, to filter out all numbers that aren't prime
        //not to be confused with the Salve of Eratosthenes, a topical rash creme
        if(nums.get(0)==1){
            nums.remove(0);
        }

        for(int i = 2; i < nums.size(); i+=0){ //manual iteration
            //elements drop down after removal
            if(nums.get(i)%2==0 && nums.get(i)!=2){ //multiples of 2
                nums.remove(i);
                //if element gets removed, don't iterate i
            } else if (nums.get(i)%3==0 && nums.get(i)!=3){ //multiples of 3
                nums.remove(i);
            } else if (nums.get(i)%5==0 && nums.get(i)!=5) { //multiples of 5
                nums.remove(i);
            } else if (nums.get(i)%7==0 && nums.get(i)!=7) { //multiples of 5
                nums.remove(i);
            } else {
                i += 1; //iterate
            }
        }






        /*
        boolean notPrime = false;
        for(int i = 0; i < nums.size() ; i++) { //loop through all elements of list
            //todo: resort to the dark arts to figure out why the hell this isn't working
            for (int w = 2; w <= nums.size()/2; ++w) { //now run modulous divide each for primes
                // condition for nonprime number
                if (nums.get(i) % w == 0) {
                    notPrime = true;
                    break;
                }
            }
            if (!notPrime){
                System.out.println("removed"+nums.get(i));
                nums.remove(nums.get(i));
            }
        }
        */

        /*
        for(int i = 0; i < nums.size() ; i++){
            for(int w = 2; w <= nums.size()/2; w++){ //init at 2. using one would include it as a prime
                //primes can't be divided by anything but 1 and itself
                if(nums.get(i)%w != 0){ //todo fix
                    //System.out.println("removed"+nums.get(i));
                    nums.remove(nums.get(i));
                }
            }
        }
        */
        System.out.print("ArrayList primes: ");
        for(int i = 0; i <nums.size(); i++){
            System.out.print(nums.get(i)+",");
        }
        System.out.println();

    }

}
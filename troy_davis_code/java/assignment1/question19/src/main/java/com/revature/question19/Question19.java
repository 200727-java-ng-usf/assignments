package com.revature.question19;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.IntStream;

/**
 * Q19. Create an ArrayList and insert integers 1 through 10.
 * Display the ArrayList.
 * Add all the even numbers up and display the result.
 * Add all the odd numbers up and display the result.
 * Remove the prime numbers from the ArrayList and print out the remaining ArrayList.
 */
public class Question19 {
    ArrayList<Integer> arrayList;
    //default constructor, go ahead and perfom the steps upon instantiation
    public Question19(){
        //create arraylist
        arrayList = new ArrayList<>();

        //insert integers 1 through 10
        for (int i = 0; i < 10; i++){
            arrayList.add(i);
        }

        //display the arrayList
        System.out.println("displaying arraylist: " + arrayList);


        //add all the even numbers up and display the result.
        int tempEvenSum = 0;
        for (Integer i : arrayList){
            if(i%2 == 0 ){
                tempEvenSum += i;
            }
        }
        System.out.println("the sum of the even numbers is: "+tempEvenSum);

        //Add all the odd numbers up and display the result.
        int tempOddSum = 0;
        for (Integer i : arrayList){
            if(i%2 != 0 ){
                tempOddSum += i;
            }
        }
        System.out.println("the sum of the odd numbers is: "+tempOddSum);

        //Remove the prime numbers from the ArrayList and print out the remaining ArrayList.
        arrayList.removeIf(i -> IntStream.rangeClosed(2, (int) Math.sqrt(i))
                .noneMatch(n -> (i % n == 0)));
        System.out.println("the arrayList after removing primes is: " + arrayList);
    }

    public static void main(String[] args) {
        Question19 q = new Question19();
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question19)) return false;
        Question19 that = (Question19) o;
        return Objects.equals(getArrayList(), that.getArrayList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArrayList());
    }

    @Override
    public String toString() {
        return "Question19{" +
                "arrayList=" + arrayList +
                '}';
    }
}

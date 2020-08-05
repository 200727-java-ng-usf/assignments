package com.revature;

import java.util.ArrayList;

public class Q19 {

    public void integerArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();


        for (int i = 1; i < 11; i++) {
            arrayList.add(i);
        }
        System.out.print("This is all the number in the ArrayList : ");
        for (Integer value : arrayList) {
            System.out.print(value + " ");
        }
        System.out.println("  ");
        System.out.println("Now I am going to add all of the even number ");
        Integer result = 0;
        for (Integer integer : arrayList) {
            if (integer % 2 == 0) {
                result = result + integer;
            }
        }
        System.out.println("The result is: " + result);


        for (int i = 0; i<arrayList.size()-1; i++){
            if (isPrime(arrayList.get(i))){
                arrayList.remove(arrayList.get(i));  // delete the prime number
            }
            System.out.print(arrayList.get(i)+"  "); // print
        }



    }

    public  boolean isPrime(int num){
        boolean prime = true;
        for (int i = 2; i < num; i++){
            if(num % i == 0){
                prime = false;
            }
        }
        return prime;
    }
}




package com.revature;
import java.util.ArrayList;

/*
    Prime number cannot be divided by any other number other itself or one.
 */

public class QuestionNine {

    public static void main(String[] args) {
        int num = 1 ;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1 ; i <= 100; i++){
            numbers.add(num++);
        }

        System.out.println(numbers);

        System.out.println("----------------------------------------------------------");

        for(int i = 0 ; i < numbers.size(); i++){

            int count = 0;
            int newNum = numbers.get(i);
            for (int x = 0 ; x < 100 ; x ++){


            }

        }




        



    }
}

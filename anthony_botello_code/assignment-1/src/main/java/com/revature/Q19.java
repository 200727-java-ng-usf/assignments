package com.revature;

import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class Q19{

    public static int addEven(List<Integer> list){
        return addNumbers(list, i -> i % 2 == 0);
    }

    public static int addOdd(List<Integer> list){
        return addNumbers(list, i -> i % 2 == 1);
    }

    public static void removePrime(List<Integer> list){}

    private static int addNumbers(List<Integer> list, Predicate<Integer> tester){

        int sum = 0;
        for(Integer i : list){

            if(tester.test(i)){
                sum += i;
            }
        }
        
        return sum;
    }

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println(list.toString());
        System.out.println("Sum of even: " + addEven(list));
        System.out.println("Sum of odd: " + addOdd(list));

        removePrime(list);
        System.out.println(list.toString());
    }


}
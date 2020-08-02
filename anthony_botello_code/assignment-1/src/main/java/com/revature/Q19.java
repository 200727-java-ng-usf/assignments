package com.revature;

import java.util.List;
import java.util.stream.Collectors;

public class Q19{

    public static int sumEven(List<Integer> list){
        return list.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
    }

    public static int sumOdd(List<Integer> list){
        return list.stream().filter(i -> i % 2 == 1).mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> removePrimes(List<Integer> list){
        return list.stream().filter(i -> !Q9.isPrime(i)).collect(Collectors.toList());
    }

    public static void displayList(List<Integer> list){
        System.out.println(list.toString());
    }
}
package com.revature;

import java.util.List;
import java.util.stream.Collectors;

public class Q19{

    public static int addEven(List<Integer> list){
        return list.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
    }

    public static int addOdd(List<Integer> list){
        return list.stream().filter(i -> i % 2 == 1).mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> removePrime(List<Integer> list){
        return list.stream().filter(i -> !Q9.isPrime(i)).collect(Collectors.toList());
    }
}
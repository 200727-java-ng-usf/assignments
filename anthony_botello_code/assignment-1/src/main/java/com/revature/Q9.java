package com.revature;

import java.util.List;
import java.util.stream.Collectors;

public class Q9 {

    public static boolean isPrime(int n){
        
        if(n <= 1) return false;

        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static List<Integer> getPrimes(List<Integer> list){
        return list.stream().filter(Q9::isPrime).collect(Collectors.toList());
    }
}
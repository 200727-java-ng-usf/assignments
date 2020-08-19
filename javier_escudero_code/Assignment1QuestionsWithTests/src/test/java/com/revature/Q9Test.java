package com.revature;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Q9Test {

    private Q9 q9;

    @Test
    public void testIfEvenNumberFound() {
        q9 = new Q9();
        ArrayList<Integer> l1 = new ArrayList<>(10);
        l1 = (Q9.onlyPrime1to100());
        System.out.println(l1);
        for (int i = 1; i < l1.size() ; i++) {
            assertTrue(" no even numbers found", ((l1).get(i) % 2 != 0));
        }
    }

    @Test
    public void testIfDivisibleBy3NumberFound() {
        q9 = new Q9();
        ArrayList<Integer> l1 = new ArrayList<>(10);
        l1 = (Q9.onlyPrime1to100());
        System.out.println(l1);
        for (int i = 2; i < q9.primeList.size() - 2; i++) {
            assertTrue(" no divisible by 3 numbers found", ((l1).get(i + 1) % 3 != 0));
        }
    }

    @Test
    public void testIfDivisibleBy5NumberFound() {
        System.out.println(" last test" + Q9.onlyPrime1to100());
        for (int i = 3; i < Q9.onlyPrime1to100().size() ; i++) {
            assertTrue(" no divisible by 5 numbers found", ((Q9.onlyPrime1to100()).get(i) % 5 != 0));
        }
    }
}
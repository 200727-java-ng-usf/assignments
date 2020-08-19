package com.revature;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import static org.junit.Assert.*;

public class Q9Test {

    private Q9 q9;

    @Test
    public void testIfEvenNumberFound() {
        q9 = new Q9();
        Q9.onlyPrime1to100();
        for (int i = 1; i < q9.primeList.size() ; i++) {
            assertTrue(" no even numbers found", ((q9.primeList).get(i) % 2 != 0));
        }
    }

    @Test
    public void testIfDivisibleBy3NumberFound() {
        Q9 q9 = new Q9();
        Q9.onlyPrime1to100();
        for (int i = 2; i < q9.primeList.size() - 2; i++) {
            assertTrue(" no divisible by 3 numbers found", ((q9.primeList).get(i + 1) % 3 != 0));
        }
    }

    @Test
    public void testIfDivisibleBy5NumberFound() {
        Q9 q9 = new Q9();
        Q9.onlyPrime1to100();
        for (int i = 3; i < q9.primeList.size() ; i++) {
            assertTrue(" no divisible by 5 numbers found", ((q9.primeList).get(i) % 5 != 0));
        }
    }
}
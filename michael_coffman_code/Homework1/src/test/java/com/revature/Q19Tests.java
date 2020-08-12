package com.revature;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Q19Tests {

    private Q19Main sut;

    @BeforeClass
    public static void beforeTests() {
        System.out.println("Begin testing of Q18 Methods");
        System.out.println("+-------------------------------------+");
    }

    @AfterClass
    public static void afterTests() {
        System.out.println("Testing complete, exiting program.");
        System.out.println("+-------------------------------------+");
    }

    @Before
    public void setUp() {
        sut = new Q19Main();
    }

    @After
    public void tearDown() {
        sut = null;
        System.out.println("+-------------------------------------+");
    }

    @Test
    public void createArrayList() {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            array.add(i);
        }
        System.out.println(array);
    }

    @Test
    public void evenNumberSum() {

        int sum = 0; // should = 30 after method executes

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            array.add(i);
        }

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) { // is even
                sum += array.get(i);
            }
        }
        System.out.println(array);
        System.out.println("The sum of all even numbers are: " + sum);
    }

    @Test
    public void oddNumberSum() {

        int sum = 0; // should = 25 after method executes

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            array.add(i);
        }

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 != 0) { // is odd
                sum += array.get(i);
            }
        }
        System.out.println(array);
        System.out.println("The sum of all odd numbers are: " + sum);
    }

    @Test
    public void removePrimes() {

        ArrayList<Integer> array = new ArrayList<>();

        // make array with 1-10 inside
        for (int i = 1; i <= 10; i++) {
            array.add(i);
        }

        // outside loop to remove primes
        for (int i = 1; i <= 5;) {

            int factorCount = 0;

            for (int j = 2; j <= array.get(i); j++) {

                if (array.get(i) % j == 0) {
                    factorCount++;
                }
            }

            if (factorCount < 2) {
                array.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(array);
    }
}

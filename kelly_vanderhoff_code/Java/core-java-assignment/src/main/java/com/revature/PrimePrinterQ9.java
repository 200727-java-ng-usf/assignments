package com.revature;

import java.util.ArrayList;

public class PrimePrinterQ9 {

    private int bounds;
    private ArrayList<Integer> numList;
    private ArrayList<Integer> primeList;

    public PrimePrinterQ9 () {
        this(100);
    }

    public PrimePrinterQ9(int bounds) {
        this.bounds = bounds;
        this.numList = new ArrayList<>(bounds);
        for (int i = 0; i < bounds; i++) this.numList.add(i + 1);
    }

    public void setBounds(int bounds) {
        this.bounds = bounds;
    }

    public int getBounds() {
        return bounds;
    }

    public void findPrimes() {
        int index = this.primeList.size() - 1;
        int start = 3; // our default prime calculation start point
        if (!this.primeList.isEmpty()) {
            if (this.primeList.get(index) >= this.bounds){
                while (this.primeList.get(index) > this.bounds) this.primeList.remove(index--);
                return; // primeList already contained a list of primes, so we only needed
                        // to trim that list down to values <= our upper bounds
            }
            // set start value for last found prime + 2
            start = this.primeList.get(index) + 2;
        } else if (bounds >= 2) {
            // 2 is the smallest prime number, so as long as our bounds is >= 2,
            // add 2 to our primes list
            this.primeList.add(2);
        } else return; // if bounds < 2
        // since the only even prime is 2, iterate through only odd numbers
        // between 3 and our upper bounds
        for (int i = start; i <= bounds; i += 2) {
            boolean notPrime = false;
            // iterate through each smaller prime value in results to test to
            // see if the current value for i is divisible by them
            for (int prime : this.primeList) {
                // Test to see if our current value is divisible by any of our
                // smaller value found primes, and set notPrime = true if so
                if (i % prime == 0) {
                    notPrime = true;
                    break;
                }
            }
            if (!notPrime) {
                this.primeList.ensureCapacity(this.primeList.size() + 1);
                this.primeList.add(i);
            }
        }
        this.primeList.trimToSize();
    }

    public ArrayList<Integer> getPrimes() {
        if (this.primeList.isEmpty()) {
            findPrimes();
        }
        return this.primeList;
    }

    @Override
    public String toString() {
        return "PrimePrinterQ9{" +
                "bounds=" + bounds +
                '}';
    }
}

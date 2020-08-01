package com.revature;

public class FactorialQ4 {
    private final int depth;
    private final int value;

    public FactorialQ4(int n) {
        this.depth = n;
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        this.value = product;
    }

    public void print() {
        System.out.print("A factorial of " + this.depth);
        System.out.println(" has a value of " + this.value);
    }

    public static void main(String[] args) {
        FactorialQ4 nFact = new FactorialQ4(9);
        nFact.print();
    }
}

package com.revature;

public class Q15{

    public interface Arithmetic {

        public int add(int a, int b);
        public int subtract(int a, int b);
        public int multiply(int a, int b);
        public int divide(int a, int b);
    }

    public static class Calculator implements Arithmetic{

        public int add(int a, int b){
            return a + b;
        }
        
        public int subtract(int a, int b){
            return a - b;
        }

        public int multiply(int a, int b){
            return a * b;
        }

        public int divide(int a, int b){
            return a / b;
        }
    }
}
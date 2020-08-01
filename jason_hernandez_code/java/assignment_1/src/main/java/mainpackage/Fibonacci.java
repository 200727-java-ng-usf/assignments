package mainpackage;

public class Fibonacci {

    Fibonacci x; // Set class attribute

    public Fibonacci() {
        x = 0;
        // First, set up an array with length 25
        Fibonacci[] fibonacciArray = new Fibonacci[25];

        // Begin with the value of zero
        fibonacciArray[0] = x;

        // Add 1
        fibonacciArray[1] = 1;

        // Each subsequent number is the sum of the two previous
        for(int i = 2; i < fibonacciArray.length; i++)
            fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];

        public Fibonacci[] getFibonacciArray() {
            return fibonacciArray;
        }

        public void setFibonacciArray(Fibonacci[] fibonacciArray) {
            this.fibonacciArray = fibonacciArray;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }

}




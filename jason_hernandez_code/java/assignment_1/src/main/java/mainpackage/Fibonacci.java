package mainpackage;

public class Fibonacci {

    int[] fibonacciArray;

    public Fibonacci() {
        int x = 0;
        // First, set up an array with length 25
        fibonacciArray = new int[25];

        // Begin with the value of zero
        fibonacciArray[0] = x;

        // Add 1
        fibonacciArray[1] = 1;

        // Each subsequent number is the sum of the two previous
        for(int i = 2; i < fibonacciArray.length; i++)
            fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];

    }
    // Generate getters and setters
    public int[] getFibonacciArray() {
        return fibonacciArray;
    }

    public void setFibonacciArray(int[] fibonacciArray) {
        this.fibonacciArray = fibonacciArray;
    }
}




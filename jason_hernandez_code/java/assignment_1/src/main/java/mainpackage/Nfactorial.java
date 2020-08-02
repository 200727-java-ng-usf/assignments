package mainpackage;

public class Nfactorial {

    public Nfactorial() {

        // First, set up an array with length unknown
        int n;
        int[] nfactorials = new Nfactorial[n];

        // Begin with the value of n

        nfactorials[0] = n;

        // Factorial means n * (n-1) * (n-2) etc. for as many iterations as the initial value n
        // Set up array of ints to multiply
        for(int i = 1; i < nfactorials.length; i++)
            nfactorials[i] = nfactorials[i-1] - 1;

        // Multiply each new number by the previous product
        int runningProduct;
        for(int j = 1; j < nfactorials.length; j++)
            runningProduct = nfactorials[j-1] * nfactorials[j];


    }

}


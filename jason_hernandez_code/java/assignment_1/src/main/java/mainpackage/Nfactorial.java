package mainpackage;

import java.util.ArrayList;

public class Nfactorial {

    public Nfactorial() {

        //  Code suggested by a Slack user:
        ArrayList<Integer> nFactorials = new ArrayList<Integer>();
        int n;
        nFactorials.addAll(new Nfactorial[n]);

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


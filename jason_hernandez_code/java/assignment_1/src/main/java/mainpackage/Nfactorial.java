package mainpackage;

public class Nfactorial {

    public double nFactorial() {

        double n = 0;

        {
            int res = 1, i;
            for (i=2; i<=n; i++)
                res *= i;
            double factorial = res;

            System.out.println("n-factorial for " + n + " is " + factorial);
            return factorial;
        }

    }

}


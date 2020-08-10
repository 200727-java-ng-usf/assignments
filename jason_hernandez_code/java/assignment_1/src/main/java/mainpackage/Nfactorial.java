package mainpackage;

public class Nfactorial {

    public void nFactorial() {

        double n = 0;
        double factorial;

        {
            int res = 1, i;
            for (i=2; i<=n; i++)
                res *= i;
            factorial = res;

            System.out.println("n-factorial for " + n + " is " + factorial);
        }

    }

}


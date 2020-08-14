package mainpackage;

public class Nfactorial {

    public double nFactorial() {

        double n = 4;

        {
            int res = 1, i;
            // The length is n
            for (i=2; i<=n; i++)
                // Multiplication is commutative,
                // so multiplying by increments gives the same result as by decrements.
                res *= i;
            double factorial = res;

            System.out.println("n-factorial for " + n + " is " + factorial);
            return factorial;
        }

    }

}


package nFactorial;

public class NFactorial {
    public long NFactorial(long n) {

        if ( n <= 1){

            return 1;
        }
        else{
            return n * NFactorial(n-1);
        }


    }
}

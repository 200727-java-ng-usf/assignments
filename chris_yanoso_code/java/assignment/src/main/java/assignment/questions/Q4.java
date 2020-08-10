package assignment.questions;

public class Q4 {

    public int nFactorial(int n) {
        int nFact = 1;
        int i = 1;
        while (i != n + 1) {
            //starts from 1 goes up and multiples every time
            nFact = nFact * i;
            i++;
        }
        return nFact;
    }
}

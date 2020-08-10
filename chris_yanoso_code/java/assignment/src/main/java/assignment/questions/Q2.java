package assignment.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {

    public String nFib(int n){
        int nFibnums[] = new int[n];
        if (n == 1);{
        nFibnums[0] = 1;
        }
        if (n > 1 )
        { nFibnums[1] = 1;
        int num1 = 0;
        int num2 = 1;
        int nFibSum = 0;
        for (int i = 1; i < n; i++) {
            //adds the new number to the old sum
            nFibSum = num1 + num2;
            num1 = num2;
            // saves the old sum
            num2 = nFibSum;
            nFibnums[i] = nFibSum;
        }
    }
        return Arrays.toString(nFibnums);
    }
}

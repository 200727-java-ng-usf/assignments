package assignment.questions;

public class Q2 {

    public void nFib(int n){
        int num1 = 0;
        int num2 = 1;
        int nFibSum = 0;
        for (int i = 1; i != n+1; i++){
            //adds the new number to the old sum
            nFibSum = num1 + num2;
            num1 = num2;
            // saves the old sum
            num2 = nFibSum;
        }
        System.out.println(nFibSum);
    }
}

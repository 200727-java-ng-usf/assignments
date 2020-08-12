package assignment.questions;

import assignment.questions.question15.InterfaceQ15;

public class Q15 implements InterfaceQ15 {
    //implements an interface
    // overrides methods
    //simple math methods

    @Override
    public int addition(int n1, int n2) {
        int add = n1 + n2;
        return add;
    }

    @Override
    public int subtraction(int n1, int n2) {
        int sub = n1 - n2;
        return sub;
    }

    @Override
    public int multiplication(int n1, int n2) {
        int mult = n1*n2;
        return mult;
    }

    @Override
    public int division(int n1, int n2) {
        int div = n1/n2;
        return div;
    }
}

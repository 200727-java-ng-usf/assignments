package com.revature.question4;

/*
     Q4. Write a program to compute N factorial.
 */

public class Question4 {
    int numberToFactor;
    int factorialtoReturn;

    public Question4(int numberToFactor) {
        //store the initial value
        this.numberToFactor = numberToFactor;
        //get the factorial upon initialization
        this.factorialtoReturn = findFactiroal(this.numberToFactor);
    }

    private int findFactiroal(int someNumber){
        //temprary value to hold the factored number
        int factoredNumber = 1;
        //iterate based on the number that needs to be factored starting at 1
        for(int i = 1; i <=someNumber;i++){
            //multiply the number by the iteration count
            factoredNumber = factoredNumber*i;
        }

        return factoredNumber;
    }
    public double getNumberToFactor() {
        return numberToFactor;
    }

    public void setNumberToFactor(int numberToFactor) {
        this.numberToFactor = numberToFactor;
    }

    public double getFactorialtoReturn() {
        return factorialtoReturn;
    }

    public void setFactorialtoReturn(int factorialtoReturn) {
        this.factorialtoReturn = factorialtoReturn;
    }

    @Override
    public String toString() {
        return "Question4{" +
                "numberToFactor=" + numberToFactor +
                ", factorialtoReturn=" + factorialtoReturn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question4)) return false;

        Question4 question4 = (Question4) o;

        if (numberToFactor != question4.numberToFactor) return false;
        return factorialtoReturn == question4.factorialtoReturn;
    }

    @Override
    public int hashCode() {
        int result = numberToFactor;
        result = 31 * result + factorialtoReturn;
        return result;
    }
}

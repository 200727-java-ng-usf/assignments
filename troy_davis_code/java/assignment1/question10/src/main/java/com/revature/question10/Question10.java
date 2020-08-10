/**
 * Q10. Find the minimum of two numbers using ternary operators.
 */
package com.revature.question10;

import java.util.Objects;

public class Question10 {
    //field to hold the minimum values
    private int minimum;

    //no args constructor, set the min to the lowest possible value
    public Question10(){
        this.minimum = Integer.MIN_VALUE;
    }

    //parameterized constructor for evaluationg minimums upon instantiation, if needed of course
    public Question10(int number1, int number2){
        getTernaryMinimum(number1, number2);
    }

    public int getTernaryMinimum(int number1, int number2) {
        minimum = number1 < number2 ? number1 : number2;
        return minimum;
    }

    //generated methods:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question10)) return false;
        Question10 that = (Question10) o;
        return minimum == that.minimum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minimum);
    }

    @Override
    public String toString() {
        return "Question10{" +
                "minimum=" + minimum +
                '}';
    }
}

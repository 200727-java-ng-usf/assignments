package com.revature.question6;

import java.util.Objects;

/**
 * Q6. Write a program to determine if an integer is even without using the modulus operator (%)
 */

public class Question6 {
    private boolean isEven;

    public Question6(){
        super();
    }

    public boolean isEven(Integer someIneteger) {
        //test for null or zero values first
        if (someIneteger == null) {
            return false;
        }else if(someIneteger == 0){
            return true;
        } else {
            //if the integer can be divided by two and still equal itself times two, it is even
            int tempInteger = someIneteger/2;
            if(tempInteger*2 == someIneteger){
                return true;
            }else{
                return false;
            }
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question6)) return false;
        Question6 question6 = (Question6) o;
        return isEven == question6.isEven;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isEven);
    }

    @Override
    public String toString() {
        return "Question6{" +
                "isEven=" + isEven +
                '}';
    }
}

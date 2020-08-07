package com.revature.question11.question11AccessorPackage;

import com.revature.question11.question11VariablePackage.Question11FloatStorage;

public class Question11FloatAccessor {


    public static void main(String[] args) {
        //print the values of the floats, demonstrating that this class is
        // accessing the floats from a class that exist in another package
        Question11FloatStorage f = new Question11FloatStorage();
        System.out.println(f);
    }
}

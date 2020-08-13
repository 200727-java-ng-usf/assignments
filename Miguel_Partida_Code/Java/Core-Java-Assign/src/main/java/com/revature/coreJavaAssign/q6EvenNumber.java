package com.revature.coreJavaAssign;

public class q6EvenNumber {
    static String isItEven(int number){
        String even ="even";
        String odd = "odd";
        String no = "";
        //divide the number by 2
        //if its even or odd it will equal an int
        //equal numbers will not have a remainder
        //
        if(number <=0){
            return no ;
        }
        int halfNumber =  number / 2;

        //multiplying the halfNumber will make even numbers
        //go back to its original state
        //odd numbers will be given a number that is not its original
        int otherNumber =  halfNumber* 2;

        if (number == otherNumber){
            System.out.println(number + " is an even Number");
            return even;
        }else {
            System.out.println(number + " is an odd Number");
            return odd;
        }

    }
}

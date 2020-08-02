package com.revature;

public class Q17 {
    public void showInterest(double principal,int years,double rate){
        double interest =0.00d;
        double total = 0.00d;
        interest = principal*rate*years;
        total=principal+interest;

        System.out.println("User Principal: " + principal + "  User time: " + years + " User rate: " + rate);
        System.out.println("-------- --------- --------");
        System.out.println("User's interest is : " + interest);
        System.out.println("User;s total is : " + total);


    }


}

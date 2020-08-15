package com.revature.JavaCoreAssign;

//Q11. Write a program that would access two float-variables from a class that exists in another package.
// Note, you will need to create two packages to demonstrate the solution.


import com.revature.JavaCoreAssign.Q11Package.seperatPackageQ11;

public class  QuestionEleven  {

    seperatPackageQ11 floats = new seperatPackageQ11();

    public float BringFloatsIn(){
        System.out.println(floats.num);
        System.out.println(floats.num2);

        return floats.num;
    }




}

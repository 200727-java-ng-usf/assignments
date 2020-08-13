package com.revature.questions;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import extras.Q11Extra;

/*
    Q11. Write a program that would access two float-variables from a class that exists in another package.
    Note, you will need to create two packages to demonstrate the solution.
 */
public class Q11 {
    public static void main(String[] args) {
        System.out.println(Q11Extra.num1 + " " + Q11Extra.num2);
    }
}

package com.revature.coreJavaAssign;

public class q16NofChar {

    public static void main(String[] args) {

        //edge case if nothing is inside the command line

        if (args.length == 0) {
            System.out.println("There is no command line to print");
        } else {

            for (String commandLine : args) {
                System.out.println(commandLine);
                System.out.println(commandLine.length());
            }
        }

    }
}

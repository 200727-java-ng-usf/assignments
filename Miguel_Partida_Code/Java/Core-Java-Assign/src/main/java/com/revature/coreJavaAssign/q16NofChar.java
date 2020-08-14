package com.revature.coreJavaAssign;

public class q16NofChar {

    public static void main(String[] args) {

        //edge case if nothing is inside the command line
        String commandLine = printargs(args);
        System.out.println(commandLine);


    }
    public static String printargs(String[] args){
        String returnString = "";
        if (args.length == 0) {
            System.out.println("There is no command line to print");
            return returnString;
        } else {
            for (String commandLine : args) {
                System.out.println(commandLine);
                System.out.println(commandLine.length());
                returnString= commandLine;
            }
        }
        return returnString;
    }
}
